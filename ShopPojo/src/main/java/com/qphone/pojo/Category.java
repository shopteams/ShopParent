package com.qphone.pojo;

import java.io.Serializable;

public class Category implements Serializable{
    private Integer categoryId;

    private String categoryName;

    private String categoryImageSrc;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getCategoryImageSrc() {
        return categoryImageSrc;
    }

    public void setCategoryImageSrc(String categoryImageSrc) {
        this.categoryImageSrc = categoryImageSrc == null ? null : categoryImageSrc.trim();
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryImageSrc='" + categoryImageSrc + '\'' +
                '}';
    }
}