package com.zhao.graduate.controller;

import com.zhao.graduate.POJO.Evaluate;
import com.zhao.graduate.POJO.UserInfo;
import com.zhao.graduate.entity.MsgResult;
import com.zhao.graduate.service.IEvaluateService;
import com.zhao.graduate.service.IUserService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * autor:liman
 * comment:登录
 */
@RestController
public class LoginController {

    Logger logger = LoggerFactory.getLogger(AddressController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
    public MsgResult login(@RequestParam("openId") String openId,@RequestParam("password") String password,@RequestParam("username") String username){
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
}