package com.qphone.dao;

import com.qphone.pojo.Propertyvalue;

public interface PropertyvalueMapper {
    int deleteByPrimaryKey(Integer propertyvalueId);

    int insert(Propertyvalue record);

    int insertSelective(Propertyvalue record);

    Propertyvalue selectByPrimaryKey(Integer propertyvalueId);

    int updateByPrimaryKeySelective(Propertyvalue record);

    int updateByPrimaryKey(Propertyvalue record);
}