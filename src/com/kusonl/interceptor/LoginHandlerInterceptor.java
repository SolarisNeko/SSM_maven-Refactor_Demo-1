package com.kusonl.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String requestURI = request.getRequestURI();

        if (requestURI.endsWith("login")) {
            return true;
        } else if (request.getSession().getAttribute("user") != null) {
            return true;
        }

        // 必须使用【.getRequestDispatcher()】,不然用户无法访问【login.jsp】
        request.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(request, response);
        return false;


    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
