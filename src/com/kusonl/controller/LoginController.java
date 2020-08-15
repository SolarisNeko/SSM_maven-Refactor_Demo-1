package com.kusonl.controller;

import com.kusonl.domain.User;
import com.kusonl.service.ProductService;
import com.kusonl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private ProductService productService;
    @Autowired
    private UserService userService;

    @RequestMapping("check_login")
    public String login(String username, String password, HttpSession session) {

        User user = userService.Login(username, password);
            // User表没有password, 用id顶替

        // 模拟查询
        if (username.equals("admin") && password.equals("123") ) {

            session.setAttribute("user", username);

            return "redirect:/product";

        }

        return "login";


    }

}
