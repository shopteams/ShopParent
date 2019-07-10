package com.qphone.service.impl;

import com.qphone.dao.CategoryMapper;
import com.qphone.dao.PropertyMapper;
import com.qphone.pojo.Category;
import com.qphone.pojo.Property;
import com.qphone.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryMapper categoryMapper;
    @Resource
    private PropertyMapper propertyMapper;

    @Override
    public List<Category> getAllcategoryService() {
        return categoryMapper.getAllCateGory();
    }

    @Override
    public List<Category> getAllcategoryService(String categoryName) {
        return categoryMapper.getCateGoryLike(categoryName);
    }

    @Override
    public int getCategoryCount() {
        return categoryMapper.getCategoryCount();
    }

    @Override
    public int getCategoryCount(String categoryName) {
        return categoryMapper.getCategoryCountLike(categoryName);
    }

    @Override
    public Category selectCategoryByPrimaryKey(int categoryId) {
        return categoryMapper.selectByPrimaryKey(categoryId);
    }

    @Override
    public List<Property> selectPropertyByCategoryId(int categoryId) {
        return propertyMapper.selectPropertyByCategoryId(categoryId);
    }

    @Override
    public void updataCategory(String[] s1, String[] s2, Category category) {
        categoryMapper.updateByPrimaryKeySelective(category);
        Property property=null;
        for (int i = 0; i <s1.length ; i++) {
            property=new Property();
            property.setPropertyId(Integer.valueOf(s1[i]));
            property.setPropertyName(s2[i]);
            propertyMapper.updateByPrimaryKeySelective(property);
            property=null;
        }
    }

    @Override
    public void insertCategoryAndProperty(String[] s1, Category category){
        categoryMapper.insertSelective(category);
        int categoryId=categoryMapper.getNewCategoryId(category.getCategoryName());
        Property property=null;
        for (int i = 0; i <s1.length ; i++) {
            property=new Property();
            property.setPropertyCategoryId(categoryId);
            property.setPropertyName(s1[i]);
            propertyMapper.insertSelective(property);
            property=null;
        }
    }


}
