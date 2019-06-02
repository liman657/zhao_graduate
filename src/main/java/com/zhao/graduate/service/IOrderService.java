package com.zhao.graduate.service;

import com.zhao.graduate.POJO.Order;
import com.zhao.graduate.POJO.OrderFood;

import java.util.List;

/**
 * autor:liman
 * createtime:2019/6/2
 * comment:
 */
public interface IOrderService {

    public List<Order> selectOrderList();

    public Order selectByOrderId(Integer orderId);

    public int insertOrder(Order order);

    public int insertOrderAndFood(OrderFood orderFood);

}
