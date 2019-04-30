package com.zhao.graduate.controller;

import com.zhao.graduate.POJO.Coupon;
import com.zhao.graduate.entity.MsgResult;
import com.zhao.graduate.service.ICouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
@RequestMapping("/coupon")
@RestController
public class CouponController {

    @Autowired
    private ICouponService couponService;

    @RequestMapping("/getList")
    public MsgResult getAllCoupon(){
        MsgResult msgResult = new MsgResult(0,"查询成功!");
        List<Coupon> allCoupon = couponService.getAllCoupon();
        if(allCoupon.size()>1){
            msgResult.setData(allCoupon);
            return msgResult;
        }else{
            msgResult.setRetCode(9999);
            msgResult.setRetMsg("查询无记录");
            return msgResult;
        }
    }
}