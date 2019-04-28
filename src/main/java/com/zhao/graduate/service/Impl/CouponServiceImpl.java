package com.zhao.graduate.service.Impl;

import com.zhao.graduate.POJO.Coupon;
import com.zhao.graduate.dao.CouponMapper;
import com.zhao.graduate.service.ICouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
@Service("couponService")
public class CouponServiceImpl implements ICouponService {

    @Autowired
    private CouponMapper couponMapper;

    @Override
    public List<Coupon> getAllCoupon() {
        return couponMapper.selectAllCoupon();
    }
}
