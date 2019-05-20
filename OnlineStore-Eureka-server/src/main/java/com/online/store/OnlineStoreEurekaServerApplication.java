package com.online.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class OnlineStoreEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineStoreEurekaServerApplication.class, args);
	}

}
