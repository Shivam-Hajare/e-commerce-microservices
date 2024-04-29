package com.app.ServiceRegistrationServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistrationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistrationServerApplication.class, args);
	}

}
