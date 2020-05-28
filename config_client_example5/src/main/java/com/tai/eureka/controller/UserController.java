package com.tai.eureka.controller;

import com.tai.eureka.domain.User;
import com.tai.eureka.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RefreshScope  //开启动态刷新
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private Environment environment;

    //获取配置文件中设置的固定属性值
    @Value("${name}")
    private String name;

    @RequestMapping(value ="/query", method = {RequestMethod.POST,RequestMethod.GET})
    public User queryUsers(@RequestParam String name) {
        logger.info("查询用户--info:"+name);
        logger.info("ip:"+environment.getProperty("spring.cloud.client.ip-address"));
        logger.info("port:"+environment.getProperty("server.port"));
        return  userService.getUserByName(name);
    }

    @RequestMapping(value = "/queryName",method = {RequestMethod.POST,RequestMethod.GET})
    public String queryName(){
        logger.info("查询属性值--name:"+name);
        return name;
    }

}
