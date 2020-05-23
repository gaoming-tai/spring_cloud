package com.tai.gateway.filiter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Description 身份认证过滤器
 */
@Component
public class LoginFiliter implements GlobalFilter, Ordered {

    /**
    * @Description 登录 access-token身份认证过滤器
     * ServerWebExchange 相当于应用上下文（类似Zuul中的RequestContext类）
    **/
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("执行了登录过滤器...");
       /* //获取access-token 参数
        String token = exchange.getRequest().getQueryParams().getFirst("access-token");
        //access-token校验
        if(StringUtils.isEmpty(token)){
            //设置响应状态码
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            //阻拦请求 返回
            return exchange.getResponse().setComplete();
        }*/
        return chain.filter(exchange); //继续向下执行
    }
    /*
    * @Description 过滤器执行顺序：返回值越小，过滤器执行优先级越高
    **/
    public int getOrder() {
        return 0;
    }
}
