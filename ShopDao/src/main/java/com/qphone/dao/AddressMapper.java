package com.qphone.dao;

import com.qphone.pojo.Address;

public interface AddressMapper {
    int deleteByPrimaryKey(String addressAreaid);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(String addressAreaid);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
}