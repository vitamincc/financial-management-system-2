package com.xuzhu.fmsauthservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FmsAuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FmsAuthServiceApplication.class, args);
	}
}
