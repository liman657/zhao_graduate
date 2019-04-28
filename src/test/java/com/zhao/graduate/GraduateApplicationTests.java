package com.zhao.graduate;

import com.zhao.graduate.POJO.Coupon;
import com.zhao.graduate.POJO.Food;
import com.zhao.graduate.POJO.Shop;
import com.zhao.graduate.dao.CouponMapper;
import com.zhao.graduate.dao.FoodMapper;
import com.zhao.graduate.dao.ShopMapper;
import com.zhao.graduate.service.ICouponService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GraduateApplication.class)
public class GraduateApplicationTests {

    @Autowired
    private ICouponService couponService;

    @Autowired
    private CouponMapper couponMapper;

    @Autowired
    private ShopMapper shopMapper;

    @Autowired
    private FoodMapper foodMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testCouponList(){
        List<Coupon> allCoupon = couponService.getAllCoupon();
        System.out.println( allCoupon);

    }

    @Test
    public void testSelectCouponWithUser(){
        List<Coupon> couponList = couponMapper.selectCouponWithUser();
        System.out.println(couponList);
    }

    @Test
    public void testShopMapper(){
        List<Shop> shops = shopMapper.selectShopById(1);
        System.out.println(shops);
    }

    @Test
    public void testFoodMapper(){
        Food food = new Food();
        food.setCategoryId(5);
        List<Food> foods = foodMapper.selectFoodByIdAndCategoryId(food);
        System.out.println(foods);
    }
}
