package com.zhao.graduate.POJO;

import java.util.Date;
import java.util.List;

/**
 * autor:liman
 * comment:红包实体
 */
public class Coupon {

    private Integer id;
    private Integer userId;
    private Integer modelId;
    private Date startDate;
    private Date endDate;
    private UserInfo userInfo;
    private CouponModel couponModel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }



    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public CouponModel getCouponModel() {
        return couponModel;
    }

    public void setCouponModel(CouponModel couponModel) {
        this.couponModel = couponModel;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "id=" + id +
                ", userId=" + userId +
                ", modelId=" + modelId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", userInfo=" + userInfo +
                ", couponModel=" + couponModel +
                '}';
    }
}
