package com.qphone.pojo;

import java.io.Serializable;

public class Propertyvalue implements Serializable{
    private Integer propertyvalueId;

    private String propertyvalueValue;

    private Integer propertyvaluePropertyId;

    private Integer propertyvalueProductId;

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
        this.propertyvalueValue = propertyvalueValue == null ? null : propertyvalueValue.trim();
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
        return "Propertyvalue{" +
                "propertyvalueId=" + propertyvalueId +
                ", propertyvalueValue='" + propertyvalueValue + '\'' +
                ", propertyvaluePropertyId=" + propertyvaluePropertyId +
                ", propertyvalueProductId=" + propertyvalueProductId +
                '}';
    }
}