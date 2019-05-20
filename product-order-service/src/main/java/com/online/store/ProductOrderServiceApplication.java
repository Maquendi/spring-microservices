package com.online.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProductOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductOrderServiceApplication.class, args);
	}

}
