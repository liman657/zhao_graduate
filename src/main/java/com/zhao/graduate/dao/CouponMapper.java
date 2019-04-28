package com.zhao.graduate.dao;

import com.zhao.graduate.POJO.Coupon;
import com.zhao.graduate.POJO.UserInfo;

import java.util.List;

/**
 * autor:liman
 * comment:
 */
//@Repository
public interface CouponMapper {

    public List<Coupon> selectAllCoupon();

    public List<Coupon> selectCouponWithUser();

}
