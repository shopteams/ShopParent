package com.qphone.dao;

import com.qphone.pojo.Product;
import com.qphone.pojo.Property;

import java.util.List;

public interface PropertyMapper {
    int deleteByPrimaryKey(Integer propertyId);

    int insert(Property record);

    int insertSelective(Property record);

    Property selectByPrimaryKey(Integer propertyId);

    int updateByPrimaryKeySelective(Property record);

    int updateByPrimaryKey(Property record);

    List<Property> selectPropertyByCategoryId(int categoryId);

    List<Property> getAllPropertyValueByCategoryId(int categoryId);
}