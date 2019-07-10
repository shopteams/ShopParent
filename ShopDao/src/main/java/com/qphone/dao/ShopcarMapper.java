package com.qphone.dao;

import com.qphone.pojo.Shopcar;

public interface ShopcarMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shopcar record);

    int insertSelective(Shopcar record);

    Shopcar selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shopcar record);

    int updateByPrimaryKey(Shopcar record);
}