package com.qphone.dao;

import com.qphone.pojo.Propertyvalue;
import com.qphone.vo.ProductAndPropertyValue;

import java.util.List;

public interface PropertyvalueMapper {
    int deleteByPrimaryKey(Integer propertyvalueId);

    int insert(Propertyvalue record);

    int insertSelective(Propertyvalue record);

    Propertyvalue selectByPrimaryKey(Integer propertyvalueId);

    int updateByPrimaryKeySelective(Propertyvalue record);

    int updateByPrimaryKey(Propertyvalue record);

    int deleteByProductId(int productId);

    List<ProductAndPropertyValue> getAllPropertyValue(Integer productId);
}