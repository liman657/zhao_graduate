package com.zhao.graduate.service;

import com.zhao.graduate.POJO.Category;
import com.zhao.graduate.POJO.UserInfo;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
public interface IUserService {

    public List<UserInfo> getAllUserInfo();

    public UserInfo getUserByOpenId(String openId);

}
