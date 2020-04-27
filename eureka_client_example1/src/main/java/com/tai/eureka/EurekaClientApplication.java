package com.tai.eureka;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication  //启动类
@MapperScan("com.tai.eureka.dao")    // mapper 接口类扫描包配置
@EnableEurekaClient //激活eureka client
public class EurekaClientApplication {

	/*
	* @Author gaoming 
	* @Description 创建RestTemplate实例  用户访问REST服务实例
	* @Date  
	* @Param 
	* @return org.springframework.web.client.RestTemplate
	**/
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
}
