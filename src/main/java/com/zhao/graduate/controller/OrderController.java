package com.zhao.graduate.controller;

import com.zhao.graduate.POJO.Order;
import com.zhao.graduate.POJO.OrderFood;
import com.zhao.graduate.POJO.UserAddress;
import com.zhao.graduate.entity.MsgResult;
import com.zhao.graduate.service.IAddressService;
import com.zhao.graduate.service.IOrderService;
import com.zhao.graduate.utils.DateUtil;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * autor:liman
 * comment:
 */
@RequestMapping("/order")
@RestController
public class OrderController {

    Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private IOrderService orderService;



    @RequestMapping("/getList")
    public Object getOrderList(){
        MsgResult msgResult = new MsgResult(0,"成功");
        try{
            List<Order> orderList = orderService.selectOrderList();
            msgResult.setData(orderList);

        }catch (Exception e){
            msgResult.setRetCode(9);
            msgResult.setRetMsg("出现异常");
            logger.error(e.getMessage());
            return msgResult;
        }
        return msgResult;
    }

    @RequestMapping("/getDetail")
    public Object getOrderById(@Param("orderId") String orderId){
        Integer idForOrder = Integer.valueOf(orderId);
        MsgResult msgResult = new MsgResult(0,"成功");
        try{
            Order order = orderService.selectByOrderId(idForOrder);
            msgResult.setData(order);
        }catch (Exception e){
            msgResult.setRetCode(9);
            msgResult.setRetMsg("出现异常");
            logger.error(e.getMessage());
            return msgResult;
        }
        return msgResult;
    }

    @RequestMapping("/order")
    public Object addOrder(@RequestBody Order order){
        order.setOrderDate(new Date());
        System.out.println(order);
        MsgResult msgResult = new MsgResult(0,"成功");
        try {
            int i = orderService.insertOrder(order);
            if(i==0){
                msgResult.setRetCode(9);
                msgResult.setRetMsg("出现异常");
            }

            List<OrderFood> foods = order.getFoods();
            for(OrderFood food:foods){
                orderService.insertOrderAndFood(food);
            }
        }catch (Exception e){
            msgResult.setRetCode(9);
            msgResult.setRetMsg("出现异常");
            logger.error(e.getMessage());
            return msgResult;
        }
        return msgResult;
    }

}
