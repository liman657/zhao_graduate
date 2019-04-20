package com.zhao.graduate.controller;

import com.zhao.graduate.POJO.UserInfo;
import com.zhao.graduate.service.IUserService;
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
}