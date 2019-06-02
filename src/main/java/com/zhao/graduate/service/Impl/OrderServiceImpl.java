package com.zhao.graduate.service.Impl;

import com.zhao.graduate.POJO.Order;
import com.zhao.graduate.dao.OrderMapper;
import com.zhao.graduate.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * autor:liman
 * createtime:2019/6/2
 * comment:
 */
@Service("orderService")
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> selectOrderList() {
        return orderMapper.selectOrderWithAllDetail();
    }

    public Order selectByOrderId(Integer orderId){
        return orderMapper.selectOrderById(orderId);
    }

    /**
     * 新增订单
     * @param order
     * @return
     */
    public int insertOrder(Order order){
        return orderMapper.insertOrder(order);
    }
}
