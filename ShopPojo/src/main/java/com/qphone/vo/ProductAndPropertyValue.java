package com.qphone.vo;

import java.io.Serializable;

public class ProductAndPropertyValue implements Serializable {
    private Integer ss=1;
    private Integer propertyId;

    private String propertyName;

    private Integer propertyCategoryId;

    private Integer propertyvalueId;

    private String propertyvalueValue;

    private Integer propertyvaluePropertyId;

    private Integer propertyvalueProductId;

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public Integer getPropertyCategoryId() {
        return propertyCategoryId;
    }

    public void setPropertyCategoryId(Integer propertyCategoryId) {
        this.propertyCategoryId = propertyCategoryId;
    }

    public Integer getPropertyvalueId() {
        return propertyvalueId;
    }

    public void setPropertyvalueId(Integer propertyvalueId) {
        this.propertyvalueId = propertyvalueId;
    }

    public String getPropertyvalueValue() {
        return propertyvalueValue;
    }

    public void setPropertyvalueValue(String propertyvalueValue) {
        this.propertyvalueValue = propertyvalueValue;
    }

    public Integer getPropertyvaluePropertyId() {
        return propertyvaluePropertyId;
    }

    public void setPropertyvaluePropertyId(Integer propertyvaluePropertyId) {
        this.propertyvaluePropertyId = propertyvaluePropertyId;
    }

    public Integer getPropertyvalueProductId() {
        return propertyvalueProductId;
    }

    public void setPropertyvalueProductId(Integer propertyvalueProductId) {
        this.propertyvalueProductId = propertyvalueProductId;
    }

    @Override
    public String toString() {
        return "ProductAndPropertyValue{" +
                "propertyId=" + propertyId +
                ", propertyName='" + propertyName + '\'' +
                ", propertyCategoryId=" + propertyCategoryId +
                ", propertyvalueId=" + propertyvalueId +
                ", propertyvalueValue='" + propertyvalueValue + '\'' +
                ", propertyvaluePropertyId=" + propertyvaluePropertyId +
                ", propertyvalueProductId=" + propertyvalueProductId +
                '}';
    }
}
