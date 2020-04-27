package com.tai.eureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @auther gaoming
 * @create 2019/12/27
 * @Description
 */
@RestController
public class ResDemoController {

    @RequestMapping("/hello")
    public String hello(){return "hello world!";}

}
