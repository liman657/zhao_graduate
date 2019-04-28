package com.zhao.graduate.service;

import com.zhao.graduate.POJO.Food;
import com.zhao.graduate.POJO.Shop;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
public interface IFoodService {

    public List<Food> getFoodInfoByShopId(Integer id);

}
