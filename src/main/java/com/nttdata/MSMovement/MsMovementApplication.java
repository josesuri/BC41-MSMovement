package com.nttdata.MSMovement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class MsMovementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsMovementApplication.class, args);
	}

}
