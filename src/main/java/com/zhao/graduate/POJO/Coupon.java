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

    private List<UserInfo> userInfoList;


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

    public List<UserInfo> getUserInfoList() {
        return userInfoList;
    }

    public void setUserInfoList(List<UserInfo> userInfoList) {
        this.userInfoList = userInfoList;
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

    @Override
    public String toString() {
        return "Coupon{" +
                "id=" + id +
                ", modelId=" + modelId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", userInfoList=" + userInfoList +
                '}';
    }
}
