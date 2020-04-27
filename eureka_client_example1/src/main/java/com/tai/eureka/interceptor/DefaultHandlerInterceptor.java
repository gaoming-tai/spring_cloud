package com.tai.eureka.interceptor;/**
 * Created by gaoming on 2019/12/29.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @version 1.0
 * @auther gaoming
 * @create 2019/12/29
 * @Description 默认处理器
 */
public class DefaultHandlerInterceptor implements HandlerInterceptor{
    Logger logger = LoggerFactory.getLogger(DefaultHandlerInterceptor.class);

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       // System.out.println("过滤器："+handler.toString());
        return true;
    }



}
