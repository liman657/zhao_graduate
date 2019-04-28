package com.zhao.graduate.service;

import com.zhao.graduate.POJO.Shop;
import com.zhao.graduate.POJO.UserInfo;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
public interface IShopService {

    public List<Shop> getShopInfoById(Integer id);

}
