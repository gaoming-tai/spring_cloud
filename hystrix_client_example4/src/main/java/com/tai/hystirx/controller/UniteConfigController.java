package com.tai.hystirx.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tai.hystirx.domain.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description 针对整个Controller 配置统一的降级方法
 * 说明：统一配置降级方法  一般针对整个类的方法返回值类型都一致情况下使用
 * @DefaultProperties 注解指定此接口的公共熔断后的降级方法
 * @HystrixCommand 不在需要指定单独的降级方法
 */
@RestController
@DefaultProperties(defaultFallback = "fallback")
@RequestMapping("/client")
public class UniteConfigController {
    private Logger logger = Logger.getLogger(UniteConfigController.class);

    @Autowired
    private RestTemplate restTemplate;
    /**
     * @Author gaoming
     *  使用注解@HystrixCommand 配置熔断保护
     **/
    @HystrixCommand
    @RequestMapping("/hystrixConfig/{name}")
    public User callOtherClient(@PathVariable String name){
        logger.info("hystirx---查询用户名："+name);
        User user =  restTemplate.getForObject("http://eureka-client-example1/user/query?name="+name, User.class);
        return user;
    }
    /**
    * @Author gaoming
    * @Description 统一的熔断降级方法
     * 说明：没有参数
    **/
    public User fallback(){
        User user = new User();
        user.setName("触发统一配置的熔断降级方法");
        return user;
    }
}
