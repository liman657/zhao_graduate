package com.zhao.graduate.service;

import com.zhao.graduate.POJO.UserAddress;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
public interface IAddressService {

    public List<UserAddress> getUserAdderssInfo(String openId);

    /**
     * 新增用户收获地址
     * @param userAddress
     * @return
     */
    int addUserReceiveAddress(UserAddress userAddress);

    int updateUserAddress(UserAddress userAddress);
}
