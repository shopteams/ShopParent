package com.qphone.pojo;

import com.qphone.pojoutils.DateTools;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Product implements Serializable {
    private Integer productId;

    private String productName;

    private String productTitle;

    private BigDecimal productPrice;

    private BigDecimal productSalePrice;

    private Date productCreateDate;
    //新加入的属性，不在dao层的mapper注入，只是作为时间格式化使用，返回string
    private String productCreateNewDate;

    private Integer productCategoryId;

    private Boolean productIsenabled;

    private Integer tyteId;
    //两表关联查询，查询上架的状态
    private String typeName;

    private List<Productimage> productimageList;

    public List<Productimage> getProductimageList() {
        return productimageList;
    }

    public void setProductimageList(List<Productimage> productimageList) {
        this.productimageList = productimageList;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getTyteId() {
        return tyteId;
    }

    public void setTyteId(Integer tyteId) {
        this.tyteId = tyteId;
    }


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle == null ? null : productTitle.trim();
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getProductSalePrice() {
        return productSalePrice;
    }

    public void setProductSalePrice(BigDecimal productSalePrice) {
        this.productSalePrice = productSalePrice;
    }

    public Date getProductCreateDate() {
        return productCreateDate;
    }

    public void setProductCreateDate(Date productCreateDate) {
        this.productCreateDate = productCreateDate;
        this.productCreateNewDate= DateTools.dateFormat(productCreateDate);
    }

    public Integer getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Integer productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Boolean getProductIsenabled() {
        return productIsenabled;
    }

    public void setProductIsenabled(Boolean productIsenabled) {
        this.productIsenabled = productIsenabled;
    }

    public String getProductCreateNewDate() {
        return productCreateNewDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productTitle='" + productTitle + '\'' +
                ", productPrice=" + productPrice +
                ", productSalePrice=" + productSalePrice +
                ", productCreateDate=" + productCreateDate +
                ", productCreateNewDate='" + productCreateNewDate + '\'' +
                ", productCategoryId=" + productCategoryId +
                ", productIsenabled=" + productIsenabled +
                ", tyteId=" + tyteId +
                ", typeName='" + typeName + '\'' +
                ", productimageList=" + productimageList +
                '}';
    }
}