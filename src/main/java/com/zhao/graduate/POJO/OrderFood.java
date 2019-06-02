package com.zhao.graduate.POJO;

/**
 * autor:liman
 * createtime:2019/6/2
 * comment:
 */
public class OrderFood {

    public Integer id;
    public Integer foodCount;
    public Integer foodId;
    public Integer orderId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(Integer foodCount) {
        this.foodCount = foodCount;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "OrderFood{" +
                "id=" + id +
                ", foodCount=" + foodCount +
                ", foodId=" + foodId +
                ", orderId=" + orderId +
                '}';
    }
}
