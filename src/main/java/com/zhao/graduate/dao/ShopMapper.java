package com.zhao.graduate.dao;

import com.zhao.graduate.POJO.Coupon;
import com.zhao.graduate.POJO.Shop;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
//@Repository
public interface ShopMapper {

    public List<Shop> selectShopById(Integer id);

}
