package com.zhao.graduate.controller;

import com.zhao.graduate.POJO.Shop;
import com.zhao.graduate.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private IShopService shopService;

    @RequestMapping("/getList")
    public List<Shop> getShopInfoById(@RequestParam Integer id){
        return shopService.getShopInfoById(id);
    }
}
