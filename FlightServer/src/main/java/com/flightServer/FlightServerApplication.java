package com.flightServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
@SpringBootConfiguration
public class FlightServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightServerApplication.class, args);
	}

}
