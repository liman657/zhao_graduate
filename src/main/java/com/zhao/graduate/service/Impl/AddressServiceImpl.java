package com.zhao.graduate.service.Impl;

import com.zhao.graduate.POJO.UserAddress;
import com.zhao.graduate.dao.AddressMapper;
import com.zhao.graduate.service.IAddressService;
import org.apache.commons.lang.StringUtils;
import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
@Service("addressService")
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<UserAddress> getUserAdderssInfo(String openId) {
        if(StringUtils.isBlank(openId)){
            return null;
        }
        return addressMapper.selectAddressByOpenId(openId);
    }

    @Override
    public int addUserReceiveAddress(UserAddress userAddress) {
        return addressMapper.saveUserAddress(userAddress);
    }
}
