package com.qphone.pojo;

public class Category {
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
}