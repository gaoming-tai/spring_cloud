package com.tai.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication  //启动类
@EnableFeignClients //激活Feign组件
public class FeignClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(FeignClientApplication.class, args);
	}
}
