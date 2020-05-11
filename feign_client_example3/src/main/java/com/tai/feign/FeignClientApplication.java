package com.tai.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication  //启动类
@EnableFeignClients //激活Feign组件
@EnableCircuitBreaker //激活hystrix
@EnableHystrixDashboard //激活hystrix web监控平台
public class FeignClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(FeignClientApplication.class, args);
	}
}
