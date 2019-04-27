package com.zhao.graduate.POJO;

/**
 * autor:liman
 * comment:
 */
public class UserAddress {

    private Integer id;
    private String openId;
    private String address;
    private String addressDetail;
    private String userName;
    private Integer sex;//收货人性别
    private String telephone;
    private Integer idDefault;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getIdDefault() {
        return idDefault;
    }

    public void setIdDefault(Integer idDefault) {
        this.idDefault = idDefault;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "id=" + id +
                ", openId='" + openId + '\'' +
                ", address='" + address + '\'' +
                ", addressDetail='" + addressDetail + '\'' +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", telephone='" + telephone + '\'' +
                ", idDefault=" + idDefault +
                '}';
    }
}
