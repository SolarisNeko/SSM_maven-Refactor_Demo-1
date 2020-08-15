package com.kusonl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HomeController {

    // void
    @RequestMapping(value = "/home1")
    public void home1(HttpServletRequest request, HttpServletResponse response, Model model) throws ServletException, IOException {

        // 原始方式, 很不建议使用
        request.setAttribute("name", "wc");
//        model.addAttribute("name", "wc"); 失败

        request.getRequestDispatcher("/WEB-INF/jsp/success.jsp").forward(request, response);
        // response.sendRedirect("..");
    }

    // String
    @RequestMapping(value = "/home2")
    public String home2(Model model) {

        // 往model域中, 设置数据
        model.addAttribute("name", "wc");
            // String类型可以

//        return "success";
        return "redirect: /product";
            // 重定向, 一个新的请求
    }

    @RequestMapping(value = "home3")
    public String home3(Model model) {
        //此操作 == forward
        return "forward:/product";
    }

    @RequestMapping(value = "/aa")
    public ModelAndView aa() { // 模拟Exception
        ModelAndView modelAndView = new ModelAndView();

        int i = 1/0;

        modelAndView.setViewName("product");
        return modelAndView;
    }

}
