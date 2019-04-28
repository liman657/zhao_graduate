package com.zhao.graduate.POJO;

import java.util.Date;

/**
 * autor:liman
 * comment:
 */
public class Evaluate {

    private Integer id;
    private String desc;
    private String image;
    private Date date;
    private Integer star;
    private Integer anonymous;
    private Integer userId;
    private Integer shopId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public Integer getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(Integer anonymous) {
        this.anonymous = anonymous;
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

    @Override
    public String toString() {
        return "Evaluate{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", image='" + image + '\'' +
                ", date=" + date +
                ", star=" + star +
                ", anonymous=" + anonymous +
                ", userId='" + userId + '\'' +
                ", shopId='" + shopId + '\'' +
                '}';
    }
}
