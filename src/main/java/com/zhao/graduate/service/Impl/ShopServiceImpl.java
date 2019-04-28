package com.zhao.graduate.service.Impl;

import com.zhao.graduate.POJO.Shop;
import com.zhao.graduate.dao.ShopMapper;
import com.zhao.graduate.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
@Service("shopService")
public class ShopServiceImpl implements IShopService {

    @Autowired
    private ShopMapper shopMapper;

    @Override
    public List<Shop> getShopInfoById(Integer id) {
        return shopMapper.selectShopById(id);
    }
}
