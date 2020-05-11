package com.tai.hystirx.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tai.hystirx.domain.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @auther gaoming
 * @create 2020/4/22
 * @Description 配置熔断保护，针对方法配置独立的降级方法
 */
@RestController
@RequestMapping("/client")
public class CircuitBreakerController {
    private Logger logger = Logger.getLogger(CircuitBreakerController.class);

    @Autowired
    private RestTemplate restTemplate;
    /**
     * @Author gaoming
     *  使用注解@HystrixCommand 配置熔断保护
     *  fallbackMethod 配置熔断之后的降级方法
     **/
    @HystrixCommand(fallbackMethod = "fallback")
    @RequestMapping("/hystrix/{name}")
    public User callOtherClient(@PathVariable String name){
        logger.info("hystirx---查询用户名："+name);
        User user =  restTemplate.getForObject("http://eureka-client-example1/user/query?name="+name, User.class);
        return user;
    }
    /**
    * @Author gaoming
    * @Description 熔断降级方法
    * 降级方法说明：
     * 1.和需要受到保护的方法返回值一致
     * 2.方法参数一致
    **/
    public User fallback(String name){
        User user = new User();
        user.setName("触发熔断降级方法");
        return user;
    }






}
