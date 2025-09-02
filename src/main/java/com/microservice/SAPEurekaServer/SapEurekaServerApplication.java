package com.microservice.SAPEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SapEurekaServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SapEurekaServerApplication.class, args);
	}

}
