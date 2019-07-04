package com.qphone.pojo;

public class Productimage {
    private Integer productimageId;

    private Boolean productimageType;

    private String productimageSrc;

    private Integer productimageProductId;

    public Integer getProductimageId() {
        return productimageId;
    }

    public void setProductimageId(Integer productimageId) {
        this.productimageId = productimageId;
    }

    public Boolean getProductimageType() {
        return productimageType;
    }

    public void setProductimageType(Boolean productimageType) {
        this.productimageType = productimageType;
    }

    public String getProductimageSrc() {
        return productimageSrc;
    }

    public void setProductimageSrc(String productimageSrc) {
        this.productimageSrc = productimageSrc == null ? null : productimageSrc.trim();
    }

    public Integer getProductimageProductId() {
        return productimageProductId;
    }

    public void setProductimageProductId(Integer productimageProductId) {
        this.productimageProductId = productimageProductId;
    }
}