package com.qphone.dao;

import com.qphone.pojo.Producttype;

public interface ProducttypeMapper {
    int deleteByPrimaryKey(Integer typeId);

    int insert(Producttype record);

    int insertSelective(Producttype record);

    Producttype selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(Producttype record);

    int updateByPrimaryKey(Producttype record);
}