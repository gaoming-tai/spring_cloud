package com.tai.zuul.filiter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

/**
 * @auther gaoming
 * @create
 * @Description Zuul登录过滤器
 */
public class LoginFiliter extends ZuulFilter {
    /**
     * @Description  指定过滤器类型
     * 四种过滤器类型：
     * 1.pre
     * 2.routing
     * 3.post
     * 4.error
     **/
    @Override
    public String filterType() {
        return "pre";
    }
    /**
     * @Description
     * 过滤器执行顺序：返回数值越小，执行顺序越高
     * @return int
     **/
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * @Description 当前过滤器是否生效
     * true: 使用此过滤器
     * false: 不使用此过滤器
     **/
    @Override
    public boolean shouldFilter() {
        return true;
    }
    /**
     * @Description 过滤器具体逻辑
     **/
    @Override
    public Object run() throws ZuulException {
        System.out.println("执行了过滤器");
        //获取Zuul提供的上下文对象
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("access-token");
        System.out.println("token校验："+token);
        return null;
    }
}
