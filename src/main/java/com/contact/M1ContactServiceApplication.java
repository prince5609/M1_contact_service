package com.contact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class M1ContactServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(M1ContactServiceApplication.class, args);
	}

}
