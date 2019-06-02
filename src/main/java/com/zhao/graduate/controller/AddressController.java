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
    public MsgResult addUserAddress(@RequestBody UserAddress userAddress){
        MsgResult msgResult = new MsgResult(0,"新增收货地址成功");
        int result= addressService.addUserReceiveAddress(userAddress);
        if(result>0){
            return msgResult;
        }else{
            msgResult.setRetMsg("服务繁忙");
            msgResult.setRetCode(9999);
            return msgResult;
        }
    }

    @RequestMapping("/updateAddress")
    public MsgResult updateUserAddress(@RequestBody UserAddress userAddress){
        MsgResult msgResult = new MsgResult(0,"新增收货地址成功");
        int result= addressService.updateUserAddress(userAddress);
        if(result>0){
            return msgResult;
        }else{
            msgResult.setRetMsg("服务繁忙");
            msgResult.setRetCode(9999);
            return msgResult;
        }
    }

}
