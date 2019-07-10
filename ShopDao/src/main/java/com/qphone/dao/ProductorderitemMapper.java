package com.qphone.dao;

import com.qphone.pojo.Productorderitem;

public interface ProductorderitemMapper {
    int deleteByPrimaryKey(Integer productorderitemId);

    int insert(Productorderitem record);

    int insertSelective(Productorderitem record);

    Productorderitem selectByPrimaryKey(Integer productorderitemId);

    int updateByPrimaryKeySelective(Productorderitem record);

    int updateByPrimaryKey(Productorderitem record);

    int deleteByProductId(int productId);
}