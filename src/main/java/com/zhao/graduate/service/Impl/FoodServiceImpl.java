package com.zhao.graduate.service.Impl;

import com.zhao.graduate.POJO.Food;
import com.zhao.graduate.dao.FoodMapper;
import com.zhao.graduate.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
@Service("foodService")
public class FoodServiceImpl implements IFoodService {

    @Autowired
    private FoodMapper foodMapper;

    @Override
    public List<Food> getFoodInfoByShopId(Integer id) {
        Food food  = new Food();
        food.setShopId(id);
        return foodMapper.selectFoodByIdAndCategoryId(food);
    }
}
