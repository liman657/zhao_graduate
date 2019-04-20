package com.zhao.graduate.dao;

import com.zhao.graduate.POJO.Category;
import com.zhao.graduate.POJO.UserInfo;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
//@Repository
public interface UserMapper {

    public List<UserInfo> selectAllUserInfo();

    public UserInfo selectUserInfoByOpenId(String openId);

}
