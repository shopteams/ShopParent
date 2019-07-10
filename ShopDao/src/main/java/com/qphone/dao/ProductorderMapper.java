package com.qphone.dao;

import com.qphone.pojo.Productorder;

public interface ProductorderMapper {
    int deleteByPrimaryKey(Integer productorderId);

    int insert(Productorder record);

    int insertSelective(Productorder record);

    Productorder selectByPrimaryKey(Integer productorderId);

    int updateByPrimaryKeySelective(Productorder record);

    int updateByPrimaryKey(Productorder record);

    int showHomepageOrder();
}