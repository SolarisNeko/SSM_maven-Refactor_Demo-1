package com.kusonl.myException;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHER implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        ModelAndView modelAndView = new ModelAndView();

        String msg = "Default error tips...";

        if (ex instanceof ErrorException) {
            msg = ((ErrorException) ex).getMsg();
        }

        String msg_tips = "出bug了，请联系管理员处理";

        modelAndView.addObject("msg", msg);
        modelAndView.addObject("msg_tips", msg_tips);
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
