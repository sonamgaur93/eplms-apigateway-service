package com.sap.eplms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EplmsApigatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EplmsApigatewayServiceApplication.class, args);
	}

}
