package com.tai.feign.controller;

import com.tai.feign.domain.User;
import com.tai.feign.feign.FeignClientInterface;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @auther gaoming
 * @create 2020/4/22
 * @Description TODO
 */
@RestController
@RequestMapping("/client")
public class CallOtherClientController {
    private Logger logger = Logger.getLogger(CallOtherClientController.class);

    @Autowired
    private FeignClientInterface feignClientInterface;
    /**
     * @Author gaoming
     * @Description 基于Feign组件调用服务接口
     **/
    @RequestMapping("/feign/{name}")
    public User callOtherClientThroughRibbon(@PathVariable String name){
        logger.info("查询用户名："+name);
        User user =  feignClientInterface.getUserByName(name);
        return user;
    }

}
