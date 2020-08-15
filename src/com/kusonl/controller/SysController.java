package com.kusonl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SysController {

    @RequestMapping("login")
    public String tologin() {
        // String -> InternalResourceViewResolver

        return "login";

    }
}
