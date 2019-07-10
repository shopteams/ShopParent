package com.qphone.dao;

import com.qphone.pojo.Product;

import java.util.List;
import java.util.Map;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> getAllProduct(Map<String, Integer> map);

    int getProductCount();

    Product selectAllProductAndOther(int productId);

    int showHomepageProduct();
}