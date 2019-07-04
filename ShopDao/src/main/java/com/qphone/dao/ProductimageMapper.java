package com.qphone.dao;

import com.qphone.pojo.Productimage;

public interface ProductimageMapper {
    int deleteByPrimaryKey(Integer productimageId);

    int insert(Productimage record);

    int insertSelective(Productimage record);

    Productimage selectByPrimaryKey(Integer productimageId);

    int updateByPrimaryKeySelective(Productimage record);

    int updateByPrimaryKey(Productimage record);
}