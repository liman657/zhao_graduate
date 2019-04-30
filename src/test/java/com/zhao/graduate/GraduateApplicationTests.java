package com.zhao.graduate;

import com.zhao.graduate.POJO.*;
import com.zhao.graduate.dao.*;
import com.zhao.graduate.service.ICouponService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
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

    @Autowired
    private EvaluateMapper evaluateMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testCouponList() {
        List<Coupon> allCoupon = couponService.getAllCoupon();
        System.out.println(allCoupon);

    }

    @Test
    public void testSelectCouponWithUser() {
        List<Coupon> couponList = couponMapper.selectCouponWithUser();
        System.out.println(couponList);
    }

    @Test
    public void testShopMapper() {
        List<Shop> shops = shopMapper.selectShopById(1);
        System.out.println(shops);
    }

    @Test
    public void testFoodMapper() {
        Food food = new Food();
        food.setCategoryId(5);
        List<Food> foods = foodMapper.selectFoodByIdAndCategoryId(food);
        for (Food f : foods) {
            System.out.println(f.getCategory());
        }
        System.out.println(foods);
    }

    @Test
    public void testEvaluateMapper() {
        List<Evaluate> evaluates = evaluateMapper.selectEvaluateByShopId(1);
        System.out.println(evaluates);
    }

    @Test
    public void testAddEvaluate() {
        Evaluate evaluate = new Evaluate();
        evaluate.setDate(new Date());
        evaluate.setShopId(1);
        evaluate.setUserId(1);
        evaluateMapper.insertEvaluate(evaluate);
    }

    @Test
    public void testOrderDetailMapper() {
//        List<Order> orders = orderMapper.selectAllOrder();
//        System.out.println(orders);

//        List<Order> orderList = orderMapper.selectAllOrderWithDetail();
//        System.out.println(orderList);

//        List<Order> orders = orderMapper.selectOrderWithShopDetail();
//        System.out.println(orders);

        List<Order> orderWithAllDetail = orderMapper.selectOrderWithAllDetail();
        System.out.println(orderWithAllDetail);
    }
}
