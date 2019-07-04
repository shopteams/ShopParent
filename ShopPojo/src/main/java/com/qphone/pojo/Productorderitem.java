package com.qphone.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Productorderitem implements Serializable{
    private Integer productorderitemId;

    private Short productorderitemNumber;

    private BigDecimal productorderitemPrice;

    private Integer productorderitemProductId;

    private Integer productorderitemOrderId;

    private Integer productorderitemUserId;

    private String productorderitemUsermessage;

    public Integer getProductorderitemId() {
        return productorderitemId;
    }

    public void setProductorderitemId(Integer productorderitemId) {
        this.productorderitemId = productorderitemId;
    }

    public Short getProductorderitemNumber() {
        return productorderitemNumber;
    }

    public void setProductorderitemNumber(Short productorderitemNumber) {
        this.productorderitemNumber = productorderitemNumber;
    }

    public BigDecimal getProductorderitemPrice() {
        return productorderitemPrice;
    }

    public void setProductorderitemPrice(BigDecimal productorderitemPrice) {
        this.productorderitemPrice = productorderitemPrice;
    }

    public Integer getProductorderitemProductId() {
        return productorderitemProductId;
    }

    public void setProductorderitemProductId(Integer productorderitemProductId) {
        this.productorderitemProductId = productorderitemProductId;
    }

    public Integer getProductorderitemOrderId() {
        return productorderitemOrderId;
    }

    public void setProductorderitemOrderId(Integer productorderitemOrderId) {
        this.productorderitemOrderId = productorderitemOrderId;
    }

    public Integer getProductorderitemUserId() {
        return productorderitemUserId;
    }

    public void setProductorderitemUserId(Integer productorderitemUserId) {
        this.productorderitemUserId = productorderitemUserId;
    }

    public String getProductorderitemUsermessage() {
        return productorderitemUsermessage;
    }

    public void setProductorderitemUsermessage(String productorderitemUsermessage) {
        this.productorderitemUsermessage = productorderitemUsermessage == null ? null : productorderitemUsermessage.trim();
    }

    @Override
    public String toString() {
        return "Productorderitem{" +
                "productorderitemId=" + productorderitemId +
                ", productorderitemNumber=" + productorderitemNumber +
                ", productorderitemPrice=" + productorderitemPrice +
                ", productorderitemProductId=" + productorderitemProductId +
                ", productorderitemOrderId=" + productorderitemOrderId +
                ", productorderitemUserId=" + productorderitemUserId +
                ", productorderitemUsermessage='" + productorderitemUsermessage + '\'' +
                '}';
    }
}