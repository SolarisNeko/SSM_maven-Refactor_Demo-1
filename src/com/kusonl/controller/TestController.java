package com.kusonl.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kusonl.domain.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

// @RestController = @Controller + @ResponseBody
@RestController
//@Controller
public class TestController {

    @RequestMapping("demo1.action")
    public ModelAndView demo1(Product product) throws JsonProcessingException {

        ModelAndView modelAndView = new ModelAndView();

        String name = product.getName();
        Float price = product.getPrice();

        Product product1 = new Product();
        product1.setName(name);
        product.setPrice(price);

        // 无非就是调用service
        // 在Spring MVC中, 可以
        // 注意点：必须要保证。。。

        System.out.println(product);
        System.out.println(product1);

        HashMap<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", 10);
        map.put("data", product);

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(map);

        modelAndView.addObject(s);

        modelAndView.setViewName("test_json");
        return modelAndView;

    }

    @RequestMapping(value = "list")
    @ResponseBody // 将 result --> JSON格式响应 （需要jackson3个jar包支持）
    public List<Product> getProductList(HttpServletResponse resp) {

        ArrayList<Product> products = new ArrayList<>();
        Product product = new Product();

        product.setName("旺财");
        product.setPrice(1f);
        product.setCreatetime(new Date());
        product.setDetail("旺财很帅");

        products.add(product);

        resp.setContentType("utf-8");

        return products; // @RequestMapping下的Method返回值 == y映射jsp
    }
}
