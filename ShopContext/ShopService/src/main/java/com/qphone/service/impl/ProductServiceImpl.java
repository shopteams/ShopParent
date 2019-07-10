package com.qphone.service.impl;

import com.qphone.dao.*;
import com.qphone.pojo.*;
import com.qphone.service.ProductService;
import com.qphone.vo.ProductAndPropertyValue;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductMapper productMapper;
    @Resource
    private ProductimageMapper productimageMapper;
    @Resource
    private ReviewMapper reviewMapper;
    @Resource
    private PropertyvalueMapper propertyvalueMapper;
    @Resource
    private ProductorderitemMapper productorderitemMapper;
    @Resource
    private CategoryMapper categoryMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private ProductorderMapper productorderMapper;
    @Resource
    private PropertyMapper propertyMapper;

    @Override
    public List<Product> getAllProduct(int page, int limit) {
        Integer start = (page - 1) * limit;
        Map<String, Integer> map = new HashMap<>();
        map.put("page", start);
        map.put("pagesize", limit);
        return productMapper.getAllProduct(map);
    }

    @Override
    public int getProductCount() {
        return productMapper.getProductCount();
    }

    @Override
    public int deleteproduct(int productId) {
        productimageMapper.deleteByProductId(productId);
        reviewMapper.deleteByProductId(productId);
        propertyvalueMapper.deleteByProductId(productId);
        productorderitemMapper.deleteByProductId(productId);
        return productMapper.deleteByPrimaryKey(productId);
    }

    @Override
    public Product selectAllProductAndOther(int productId) {
        return productMapper.selectAllProductAndOther(productId);
    }

    @Override
    public List<Category> getAllCateGory() {
        return categoryMapper.getAllCateGory();
    }

    @Override
    public List<ProductAndPropertyValue> getAllPropertyValue(Integer productId) {
        return propertyvalueMapper.getAllPropertyValue(productId);
    }

    @Override
    public void updtProduct(Product product, String[] s1, String[] propertyvalueValue) {
        productMapper.updateByPrimaryKeySelective(product);
        Propertyvalue propertyvalue = null;
        for (int i = 0; i < s1.length; i++) {
            propertyvalue = new Propertyvalue();
            int res = Integer.valueOf(s1[i]);
            propertyvalue.setPropertyvalueId(res);
            propertyvalue.setPropertyvalueValue(propertyvalueValue[i]);
            propertyvalue.setPropertyvalueProductId(null);
            propertyvalue.setPropertyvaluePropertyId(null);
            propertyvalueMapper.updateByPrimaryKeySelective(propertyvalue);
            propertyvalue = null;
        }
    }

    @Override
    public Map<String, Integer> getAllCount() {
        Map<String, Integer> map = new HashMap<>();
        int productNum = productMapper.showHomepageProduct();
        int userNum = userMapper.showHomepageUser();
        int orderNum = productorderMapper.showHomepageOrder();
        map.put("productNum",productNum);
        map.put("userNum",userNum);
        map.put("orderNum",orderNum);
        return map;
    }

    @Override
    public List<Property> getAllPropertyValueByCategoryId(int categoryId) {
        return propertyMapper.getAllPropertyValueByCategoryId(categoryId);
    }




}
