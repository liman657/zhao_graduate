package com.zhao.graduate.controller;

import com.zhao.graduate.POJO.UserInfo;
import com.zhao.graduate.entity.MsgResult;
import com.zhao.graduate.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * autor:liman
 * comment:注册
 */
@RestController
public class RegisterController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/register")
    public MsgResult registerUserInfo(@RequestBody UserInfo userInfo){
        MsgResult msgResult = new MsgResult(0,"注册成功!");
        int result = userService.addUserInfo(userInfo);
        if(result>0){
            return msgResult;
        }else{
            msgResult.setRetCode(9999);
            msgResult.setRetMsg("注册失败");
            return msgResult;
        }
    }
}