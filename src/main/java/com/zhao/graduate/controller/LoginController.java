package com.zhao.graduate.controller;

import com.alibaba.fastjson.JSONObject;
import com.zhao.graduate.POJO.Evaluate;
import com.zhao.graduate.POJO.UserInfo;
import com.zhao.graduate.entity.MsgResult;
import com.zhao.graduate.service.IEvaluateService;
import com.zhao.graduate.service.IUserService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;

/**
 * autor:liman
 * comment:登录
 */
@RestController
public class LoginController {

    Logger logger = LoggerFactory.getLogger(AddressController.class);

    @Value("${weixin.login.appid}")
    private String appid;

    @Value("${weixin.login.secret}")
    private String secret;

    @Value("${weixin.login.authUrl}")
    private String authUrl;

    @Value("${weixin.login.grantType}")
    private String grantType;

    @Autowired
    private IUserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public MsgResult login(String openId,String password, String username){
        MsgResult msgResult = new MsgResult(0,"登录成功");
        UserInfo userInfo = userService.getUserByOpenId(openId);
        if(userInfo == null){
            msgResult.setRetCode(9999);
            msgResult.setRetMsg("请先注册!");
        }
        if(StringUtils.isNotBlank(password)){
            if(password.equals(userInfo.getPassword())){
                return msgResult;
            }else{
                msgResult.setRetCode(9999);
                msgResult.setRetMsg("登录失败");
                return msgResult;
            }
        }
        msgResult.setRetCode(9999);
        msgResult.setRetMsg("登录失败");
        return msgResult;
    }

    @RequestMapping(value="/getOpenId")
    public MsgResult obtainOpenId(@RequestParam("code") String code){
        String replaceAppid = StringUtils.replace(authUrl, "[APPID]", appid);
        String replaceSecret = StringUtils.replace(replaceAppid, "[SECRET]", secret);
        authUrl = StringUtils.replace(replaceSecret, "[JSCODE]", code);
        String result = restTemplate.getForEntity(authUrl, String.class).getBody();
        MsgResult msgResult=new MsgResult(0,"成功");
        msgResult.setData(result);
        return msgResult;
    }
}