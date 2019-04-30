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
@RequestMapping("/order")
@RestController
public class OrderController {

    Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private IAddressService addressService;

}
