package com.kusonl.controller;

import com.kusonl.domain.Product;
import com.kusonl.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("list")
    public ModelAndView productList() {

        ModelAndView modelAndView = new ModelAndView();

        List<Product> productList = productService.getProductList();
        modelAndView.addObject("productList", productList);
        modelAndView.setViewName("index");
        return modelAndView;
    }


}

