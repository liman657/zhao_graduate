package com.zhao.graduate.controller;

import com.zhao.graduate.POJO.UserInfo;
import com.zhao.graduate.entity.ErrorCode;
import com.zhao.graduate.entity.MsgResult;
import com.zhao.graduate.service.IUserService;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/getUserInfo")
    public UserInfo getAllUserInfo(@Param("openId") String openId){
        return userService.getUserByOpenId(openId);
    }

    @RequestMapping("/money/in")
    public MsgResult updateUserMoney(@Param("openId") String openId,@Param("money") double money){
        MsgResult msgResult = new MsgResult(0000,"充值成功!");
        if(StringUtils.isNotBlank(openId)){
            UserInfo userInfo = userService.getUserByOpenId(openId);
            double oldMoney = userInfo.getMoney();
            userInfo.setMoney(oldMoney+money);
            userService.updateUserInfo(userInfo);
            return msgResult;
        }
        msgResult.setRetCode(ErrorCode.E_9999.getCode());
        msgResult.setRetMsg("服务繁忙");
        return msgResult;
    }

    @RequestMapping("/money/out")
    public MsgResult decreaseMoney(@Param("openId") String openId,@Param("money") double money){
        MsgResult msgResult = new MsgResult(0000,"充值成功!");
        if(StringUtils.isNotBlank(openId)){
            UserInfo userInfo = userService.getUserByOpenId(openId);
            double oldMoney = userInfo.getMoney();
            userInfo.setMoney(oldMoney-money);
            userService.updateUserInfo(userInfo);
            return msgResult;
        }
        msgResult.setRetCode(ErrorCode.E_9999.getCode());
        msgResult.setRetMsg("服务繁忙");
        return msgResult;
    }
}