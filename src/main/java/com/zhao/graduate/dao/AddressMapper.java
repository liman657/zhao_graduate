package com.zhao.graduate.dao;

import com.zhao.graduate.POJO.UserAddress;
import com.zhao.graduate.POJO.UserInfo;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
public interface AddressMapper {

    public List<UserAddress> selectAddressByOpenId(String openId);

    /**
     * 新增用户收获地址
     * @param userAddress
     * @return
     */
    int saveUserAddress(UserAddress userAddress);
}
