package com.qphone.pojo;

import java.util.Date;

public class Productorder {
    private Integer productorderId;

    private String productorderCode;

    private String productorderAddress;

    private String productorderDetailAddress;

    private String productorderPost;

    private String productorderReceiver;

    private String productorderMobile;

    private Date productorderPayDate;

    private Date productorderDeliveryDate;

    private Date productorderConfirmDate;

    private Boolean productorderStatus;

    private Integer productorderUserId;

    public Integer getProductorderId() {
        return productorderId;
    }

    public void setProductorderId(Integer productorderId) {
        this.productorderId = productorderId;
    }

    public String getProductorderCode() {
        return productorderCode;
    }

    public void setProductorderCode(String productorderCode) {
        this.productorderCode = productorderCode == null ? null : productorderCode.trim();
    }

    public String getProductorderAddress() {
        return productorderAddress;
    }

    public void setProductorderAddress(String productorderAddress) {
        this.productorderAddress = productorderAddress == null ? null : productorderAddress.trim();
    }

    public String getProductorderDetailAddress() {
        return productorderDetailAddress;
    }

    public void setProductorderDetailAddress(String productorderDetailAddress) {
        this.productorderDetailAddress = productorderDetailAddress == null ? null : productorderDetailAddress.trim();
    }

    public String getProductorderPost() {
        return productorderPost;
    }

    public void setProductorderPost(String productorderPost) {
        this.productorderPost = productorderPost == null ? null : productorderPost.trim();
    }

    public String getProductorderReceiver() {
        return productorderReceiver;
    }

    public void setProductorderReceiver(String productorderReceiver) {
        this.productorderReceiver = productorderReceiver == null ? null : productorderReceiver.trim();
    }

    public String getProductorderMobile() {
        return productorderMobile;
    }

    public void setProductorderMobile(String productorderMobile) {
        this.productorderMobile = productorderMobile == null ? null : productorderMobile.trim();
    }

    public Date getProductorderPayDate() {
        return productorderPayDate;
    }

    public void setProductorderPayDate(Date productorderPayDate) {
        this.productorderPayDate = productorderPayDate;
    }

    public Date getProductorderDeliveryDate() {
        return productorderDeliveryDate;
    }

    public void setProductorderDeliveryDate(Date productorderDeliveryDate) {
        this.productorderDeliveryDate = productorderDeliveryDate;
    }

    public Date getProductorderConfirmDate() {
        return productorderConfirmDate;
    }

    public void setProductorderConfirmDate(Date productorderConfirmDate) {
        this.productorderConfirmDate = productorderConfirmDate;
    }

    public Boolean getProductorderStatus() {
        return productorderStatus;
    }

    public void setProductorderStatus(Boolean productorderStatus) {
        this.productorderStatus = productorderStatus;
    }

    public Integer getProductorderUserId() {
        return productorderUserId;
    }

    public void setProductorderUserId(Integer productorderUserId) {
        this.productorderUserId = productorderUserId;
    }
}