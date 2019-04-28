package com.zhao.graduate.dao;

import com.zhao.graduate.POJO.Coupon;
import com.zhao.graduate.POJO.Food;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
//@Repository
public interface FoodMapper {

    public List<Food> selectFoodByIdAndCategoryId(Food food);

}
