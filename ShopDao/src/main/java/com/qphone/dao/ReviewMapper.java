package com.qphone.dao;

import com.qphone.pojo.Review;

public interface ReviewMapper {
    int deleteByPrimaryKey(Integer reviewId);

    int insert(Review record);

    int insertSelective(Review record);

    Review selectByPrimaryKey(Integer reviewId);

    int updateByPrimaryKeySelective(Review record);

    int updateByPrimaryKeyWithBLOBs(Review record);

    int updateByPrimaryKey(Review record);

    int deleteByProductId(int productId);
}