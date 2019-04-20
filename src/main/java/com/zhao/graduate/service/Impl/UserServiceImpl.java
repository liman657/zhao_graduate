package com.zhao.graduate.service.Impl;

import com.zhao.graduate.POJO.UserInfo;
import com.zhao.graduate.dao.UserMapper;
import com.zhao.graduate.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserInfo> getAllUserInfo() {
        return userMapper.selectAllUserInfo();
    }

    /**
     * 根据openId获取用户信息
     * @return
     */
    @Override
    public UserInfo getUserByOpenId(String openId) {
        return userMapper.selectUserInfoByOpenId(openId);
    }
}
