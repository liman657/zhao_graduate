package com.zhao.graduate.POJO;

/**
 * autor:liman
 * comment: 红包模式实体
 */
public class CouponModel {

    private Integer id;
    private Integer gold;
    private Integer shopId;
    private Integer threshold;
    private Integer rebate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public Integer getRebate() {
        return rebate;
    }

    public void setRebate(Integer rebate) {
        this.rebate = rebate;
    }

    @Override
    public String toString() {
        return "CouponModel{" +
                "id=" + id +
                ", gold=" + gold +
                ", shopId=" + shopId +
                ", threshold=" + threshold +
                ", rebate=" + rebate +
                '}';
    }
}
