package com.zhao.graduate.POJO;

import java.util.Date;
import java.util.List;

/**
 * autor:liman
 * comment: shop实体
 */
public class Shop {

    private Integer id;
    private String name;
    private String tel;
    private String address;
    private String desc;
    private String shopImage;
    private Integer time;
    private String logo;
    private Integer score;
    private Integer minCost;
    private Integer conveyCost;
    private Integer salesVolumes;
    private String startTime;
    private String endTime;

    private List<Food> foodList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getShopImage() {
        return shopImage;
    }

    public void setShopImage(String shopImage) {
        this.shopImage = shopImage;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getMinCost() {
        return minCost;
    }

    public void setMinCost(Integer minCost) {
        this.minCost = minCost;
    }

    public Integer getConveyCost() {
        return conveyCost;
    }

    public void setConveyCost(Integer conveyCost) {
        this.conveyCost = conveyCost;
    }

    public Integer getSalesVolumes() {
        return salesVolumes;
    }

    public void setSalesVolumes(Integer salesVolumes) {
        this.salesVolumes = salesVolumes;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", desc='" + desc + '\'' +
                ", shopImage='" + shopImage + '\'' +
                ", time=" + time +
                ", logo='" + logo + '\'' +
                ", score=" + score +
                ", minCost=" + minCost +
                ", conveyCost=" + conveyCost +
                ", salesVolumes=" + salesVolumes +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}
