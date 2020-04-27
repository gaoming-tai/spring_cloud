package com.tai.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //激活eureka Server
public class EurekaServerApplication{

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
