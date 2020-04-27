package com.tai.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication  //启动类
@EnableEurekaClient //激活eureka client
public class EurekaClientApplication {

	/*
	* @Author gaoming
	* @Description 创建RestTemplate实例  用户访问REST服务实例
	* @Date 提供注解@LoadBalanced 基于Ribbon远程调用
	* @Param
	* @return org.springframework.web.client.RestTemplate
	**/
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
}
