package com.tai.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication  //启动类
@EnableDiscoveryClient //服务发现
public class GateServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GateServerApplication.class, args);
    }
}
