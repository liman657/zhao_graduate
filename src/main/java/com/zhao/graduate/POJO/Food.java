package com.zhao.graduate.POJO;

import java.util.List;

/**
 * autor:liman
 * comment: 食物实体
 */
public class Food {

    private Integer id;
    private Integer shopId;
    private Integer categoryId;
    private String name;
    private Integer price;
    private Integer originPrice;
    private String image;
    private Integer salesVolumes;
    private Integer discountCount;

    private Category category;
    private Shop shop;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getOriginPrice() {
        return originPrice;
    }

    public void setOriginPrice(Integer originPrice) {
        this.originPrice = originPrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getSalesVolumes() {
        return salesVolumes;
    }

    public void setSalesVolumes(Integer salesVolumes) {
        this.salesVolumes = salesVolumes;
    }

    public Integer getDiscountCount() {
        return discountCount;
    }

    public void setDiscountCount(Integer discountCount) {
        this.discountCount = discountCount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", shopId=" + shopId +
                ", categoryId=" + categoryId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", originPrice=" + originPrice +
                ", image='" + image + '\'' +
                ", salesVolumes=" + salesVolumes +
                ", discountCount=" + discountCount +
                ", category=" + category +
                ", shop=" + shop +
                '}';
    }
}