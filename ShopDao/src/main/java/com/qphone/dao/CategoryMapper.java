package com.qphone.dao;

import com.qphone.pojo.Category;
import com.qphone.pojo.Property;

import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(Integer categoryId);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

    List<Category> getAllCateGory();

    int getCategoryCount();

    List<Category> getCateGoryLike(String categoryName);

    int getCategoryCountLike(String categoryName);

    int getNewCategoryId(String categoryName);
}