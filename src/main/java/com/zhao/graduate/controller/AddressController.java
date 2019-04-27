package com.zhao.graduate.controller;

import com.zhao.graduate.POJO.UserAddress;
import com.zhao.graduate.entity.MsgResult;
import com.zhao.graduate.service.IAddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
@RequestMapping("/addr")
@RestController
public class AddressController {

    Logger logger = LoggerFactory.getLogger(AddressController.class);

    @Autowired
    private IAddressService addressService;

    @RequestMapping("/getList")
    public List<UserAddress> getUserAddress(@RequestParam("openId") String openId){
        return addressService.getUserAdderssInfo(openId);
    }

    @RequestMapping(value = "/postAddr",method = RequestMethod.POST)
    public MsgResult updateUserAddress(@RequestBody UserAddress userAddress){
        System.out.println(userAddress);
        int result= addressService.addUserReceiveAddress(userAddress);
        System.out.println(result);
        MsgResult msgResult = new MsgResult(200,"新增收货地址成功");
        return msgResult;
    }

}
