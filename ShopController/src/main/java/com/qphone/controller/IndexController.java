package com.qphone.controller;

import com.qphone.pojo.Category;
import com.qphone.pojo.Product;
import com.qphone.pojo.Property;
import com.qphone.service.ProductService;
import com.qphone.utils.Data2Json;
import com.qphone.utils.ShopName;
import com.qphone.vo.ProductAndPropertyValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {
    @Resource
    private ProductService productService;

    /**
     * 请求首页加载各种数据2
     * @param model
     * @return
     */
    @GetMapping("/homepage")
    public String showHomePage(Model model){
        Map<String,Integer> map=productService.getAllCount();
        model.addAttribute("map",map);
        return "homeManagePage";
    }

    /**
     * 传入分页参数page，limit，默认为1，10
     * 查询后调用工具方法Data2Json将其封装一个工具类返回
     *
     * @param page  起始行
     * @param limit 每页行数
     * @return 按照要求layui结果
     */
    @GetMapping("/productManage")
    @ResponseBody
    public Data2Json showAllProductManagePage(@RequestParam(value = "page", defaultValue = "1") int page,
                                              @RequestParam(value = "limit", defaultValue = "10") int limit) {
        List<Product> list = productService.getAllProduct(page, limit);
        int count = productService.getProductCount();
        Data2Json json = new Data2Json();
        json.setData(list);
        json.setCount(count);
        return json;
    }

    /**
     * 传入一个productId，执行删除方法
     *
     * @param productId 接受参数
     * @return 成功返回1，失败返回0
     */
    @PostMapping("/del")
    @ResponseBody
    public String del(@RequestParam("productId") int productId) {
        int res = 0;
        int number = productService.deleteproduct(productId);
        if (number > 0) {
            res = 1;
        }
        return "{\"state\":\" " + res + "\"}";
    }


    /**
     * @param productId 接收一个productId，得到该产品的所有相关图片及其他信息
     * @param model     作为model模型
     * @return 返回商品全部信息
     */
    @GetMapping("/productDetails")
    public String editReturn(@RequestParam("productId") int productId, Model model) {
        //查出所有分类信息
        List<Category> category = productService.getAllCateGory();
        //查出本商品及其图片信息
        Product productimg = productService.selectAllProductAndOther(productId);
        //查询商品具体参数
        List<ProductAndPropertyValue> productandpropertyvalue = productService.getAllPropertyValue(productId);
        model.addAttribute(ShopName.CATEGORY, category);
        model.addAttribute(ShopName.PRODUCTANDIMG, productimg);
        model.addAttribute(ShopName.PRODUCTANDPROPERTYVALUE, productandpropertyvalue);
        return "productDetails";
    }

    /**
     * 对商品进行修改
     * @param product 返回对象
     * @param request 使用request获得list数组
     * @return
     */
    @PostMapping("/editProductData")
    public String editProductData(Product product,HttpServletRequest request){
        String[]s1=request.getParameterValues("propertyvalueId");
        String[]propertyvalueValue=request.getParameterValues("propertyvalueValue");
        productService.updtProduct(product,s1,propertyvalueValue);
        return "redirect:productManagePage";
    }

    @GetMapping("/showInsertProductData")
    public String showInsertProductData(@RequestParam(value = "categoryId",defaultValue = "1")int categoryId, Model model){
        //查出所有分类信息
        List<Category> category = productService.getAllCateGory();
        List<Property>  productandpropertyvalue= productService.getAllPropertyValueByCategoryId(categoryId);
        model.addAttribute(ShopName.CATEGORY,category);
        model.addAttribute(ShopName.PRODUCTANDPROPERTYVALUE,productandpropertyvalue);
        return "productDetailsAdd";
    }


    /**
     * 请求可以达到所有页面
     * @param url
     * @return
     */
    @GetMapping("/{url}")
    public String showAllPage(@PathVariable("url") String url) {
        return url;
    }
}
