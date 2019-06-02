package com.zhao.graduate.POJO;

import java.util.Date;
import java.util.List;

/**
 * autor:liman
 * comment:订单实体
 */
public class Order {

    private Integer id;
    private String number;
    private Integer total;
    private Date orderDate;
    private String shopName;
    private Integer userId;
    private Integer shopId;
    private Integer riderId;
    private Integer couponId;
    private Integer addressId;

    private UserInfo userInfo;
    private Shop shop;
    private Rider rider;
    private Coupon coupon;
    private UserAddress userAddress;

    private List<OrderFood> foods;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getRiderId() {
        return riderId;
    }

    public void setRiderId(Integer riderId) {
        this.riderId = riderId;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public UserAddress getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddress userAddress) {
        this.userAddress = userAddress;
    }

    public List<OrderFood> getFoods() {
        return foods;
    }

    public void setFoods(List<OrderFood> foods) {
        this.foods = foods;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", total=" + total +
                ", orderDate=" + orderDate +
                ", shopName='" + shopName + '\'' +
                ", userId=" + userId +
                ", shopId=" + shopId +
                ", riderId=" + riderId +
                ", couponId=" + couponId +
                ", addressId=" + addressId +
                ", userInfo=" + userInfo +
                ", shop=" + shop +
                ", rider=" + rider +
                ", coupon=" + coupon +
                ", userAddress=" + userAddress +
                ", foods=" + foods +
                '}';
    }
}
