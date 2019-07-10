package com.qphone.service;

import com.qphone.pojo.Category;
import com.qphone.pojo.Property;

import java.util.List;

public interface CategoryService {
    List<Category> getAllcategoryService();
    List<Category> getAllcategoryService(String categoryName);

    int getCategoryCount();
    int getCategoryCount(String categoryName);

    Category selectCategoryByPrimaryKey(int categoryId);

    List<Property> selectPropertyByCategoryId(int categoryId);

    void updataCategory(String[] s1, String[] s2, Category category);

    void insertCategoryAndProperty(String[] s1, Category category);
}
