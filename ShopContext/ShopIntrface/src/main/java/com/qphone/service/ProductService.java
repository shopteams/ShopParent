package com.qphone.service;

import com.qphone.pojo.Category;
import com.qphone.pojo.Product;
import com.qphone.pojo.Property;
import com.qphone.vo.ProductAndPropertyValue;

import java.util.List;
import java.util.Map;

public interface ProductService {


    List<Product> getAllProduct(int page, int limit);

    int getProductCount();

    int deleteproduct(int productId);

    Product selectAllProductAndOther(int productId);

    List<Category> getAllCateGory();


    List<ProductAndPropertyValue> getAllPropertyValue(Integer productId);

    void updtProduct(Product product, String[] s1, String[] propertyvalueValue);

    Map<String, Integer> getAllCount();

    List<Property> getAllPropertyValueByCategoryId(int categoryId);
}
