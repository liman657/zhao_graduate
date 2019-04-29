package com.zhao.graduate.controller;

import com.zhao.graduate.POJO.Food;
import com.zhao.graduate.service.IFoodService;
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
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private IFoodService foodService;

    @Autowired
    private IShopService shopService;

    @RequestMapping("/getList")
    public List<Food> getFoodInfoByShopId(@RequestParam("shopId") Integer shopId){
        return foodService.getFoodInfoByShopId(shopId);
    }


}