package com.kusonl.controller;

import com.kusonl.domain.User;
import com.kusonl.service.ProductService;
import com.kusonl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jms.Session;

@Controller
public class LoginController {

    @Autowired
    private ProductService productService;
    @Autowired
    private UserService userService;

    @RequestMapping("check_login")
    public ModelAndView login(String username, String password, Session session) {

        ModelAndView modelAndView = new ModelAndView();

        User user = userService.Login(username, password);
            // User表没有password, 用id顶替

        if (username.equals(user.getUsername()) && password.equals(user.getId()) ) {
            modelAndView.setViewName("product");
            return modelAndView;
        }

        modelAndView.setViewName("login");
        return modelAndView;

    }

}
