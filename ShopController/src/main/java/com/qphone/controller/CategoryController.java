package com.qphone.controller;

import com.alibaba.druid.util.StringUtils;
import com.qphone.pojo.Category;
import com.qphone.pojo.Property;
import com.qphone.service.CategoryService;
import com.qphone.utils.ShopName;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.UUID;

@Controller
public class CategoryController {
    @Resource
    private CategoryService categoryService;

    /**
     * 请求服装属性页面
     *
     * @param model
     * @return
     */
    @GetMapping("/categoryManagePage")
    public String showCategate(HttpServletRequest request, Model model) {
        String categoryName = request.getParameter("categoryName");
        System.out.println(categoryName);
        if (StringUtils.isEmpty("")) {
            List<Category> categoryList = categoryService.getAllcategoryService();
            int res = categoryService.getCategoryCount();
            model.addAttribute(ShopName.CATEGORYLIST, categoryList);
            model.addAttribute("res", res);
        } else {
            List<Category> categoryList = categoryService.getAllcategoryService(categoryName);
            int res = categoryService.getCategoryCount(categoryName);
            model.addAttribute(ShopName.CATEGORYLIST, categoryList);
            model.addAttribute("res", res);
        }
        return "categoryManagePage";
    }

    /**
     * 将指定id的分类找到并返回
     *
     * @param categoryId 获取指定分类的属性
     * @param model
     * @return
     */
    @GetMapping("/categoryDetails/{categoryId}")
    public String showCategateDetails(@PathVariable("categoryId") int categoryId, Model model) {
        Category category = categoryService.selectCategoryByPrimaryKey(categoryId);
        List<Property> propertyList = categoryService.selectPropertyByCategoryId(categoryId);
        model.addAttribute(ShopName.CATEGORY, category);
        model.addAttribute(ShopName.PROPERTYLIST, propertyList);
        return "categoryDetails";
    }

    /**
     * 修改种类及属性
     *
     * @param category
     * @param request
     * @param model
     * @return
     */
    @PostMapping("/editCategory")
    private String updataCategory(Category category, HttpServletRequest request, Model model) {
        String[] s1 = request.getParameterValues("propertyId");
        String[] s2 = request.getParameterValues("propertyName");
        categoryService.updataCategory(s1, s2, category);
        return "redirect:/categoryManagePage";
    }


    @PostMapping("/insertCategory")
    private String insertCategory(@RequestParam("aaa")MultipartFile file,Category category, HttpServletRequest request, Model model) {
        String fileName = file.getOriginalFilename();
        String realPath = request.getRealPath("/res/images/item/categoryPicture/");
        String houzhui = fileName.substring(fileName.lastIndexOf("."));
        fileName = UUID.randomUUID().toString().replaceAll("-", "") + houzhui;
        System.out.println(fileName);
        File file2 = new File(realPath);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file1 = new File(realPath + "/" + fileName);
        try {
            file1.createNewFile();
            file.transferTo(file1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        category.setCategoryImageSrc(fileName);
        String[] s1 = request.getParameterValues("propertyName");
        categoryService.insertCategoryAndProperty(s1, category);
        return "redirect:/categoryManagePage";
    }

}
