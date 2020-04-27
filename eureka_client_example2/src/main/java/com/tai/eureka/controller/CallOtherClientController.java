package com.tai.eureka.controller;/**
 * Created by gaoming on 2020/4/22.
 */

import com.tai.eureka.domain.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;
    /**
     * @Author gaoming
     * @Description 基于Ribbon形式 调用远程服务
     *方式：
     * 1：使用注解@LoadBalanced 声明RestTemplate
     * 2. 使用服务名替代ip地址
     * @return com.netflix.loadbalancer
     **/
    @RequestMapping("/throghRibbon/{name}")
    public User callOtherClientThroughRibbon(@PathVariable String name){
        logger.info(name);
        User user =  restTemplate.getForObject("http://eureka-client-example1/user/query?name="+name, User.class);
        return user;
    }
    /**
    * @Author gaoming 
    * @Description eureka client 服务间调用
    * eureka 通过元数据获取微服务调用路径
    * @return com.tai.eureka.domain.T_bh_dcasemsg
    **/
    @RequestMapping("/get/{name}")
    public User callOtherClient(@PathVariable String name){

        //通过指定服务名获取服务实例 eureka_client_example1 为服务应用名称
        List<ServiceInstance> list = discoveryClient.getInstances("eureka-client-example1");
        ServiceInstance instance = list.get(0);
        User user =  restTemplate.getForObject("http://"+instance.getHost()+":"+instance.getPort()+"/user/query?name="+name, User.class);
        return user;
    }
}
