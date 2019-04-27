package com.zhao.graduate.POJO;

/**
 * autor:liman
 * comment:红包实体
 */
public class Coupon {

    private Integer id;
    private Integer userId;
    private Integer modelId;

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

    @Override
    public String toString() {
        return "Coupon{" +
                "id=" + id +
                ", userId=" + userId +
                ", modelId=" + modelId +
                '}';
    }
}
