package com.zhao.graduate.dao;

import com.zhao.graduate.POJO.Order;
import com.zhao.graduate.POJO.UserInfo;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
//@Repository
public interface OrderMapper {

    public List<Order> selectAllOrder();

    public List<Order> selectAllOrderWithDetail();

    public List<Order> selectOrderWithShopDetail();

    public List<Order> selectOrderWithAllDetail();

    public Order selectOrderById(Integer orderId);

    public int insertOrder(Order order);

}
