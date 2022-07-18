package com.APIGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;




@SpringBootApplication
@EnableEurekaClient
public class FlightApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightApiGatewayApplication.class, args);
	}
//	 @Bean
//	   public WebMvcConfigurer corsConfigurer() {
//	      return new WebMvcConfigurerAdapter() {
//	         @Override
//	         public void addCorsMappings(CorsRegistry registry) {
//	            registry.addMapping("/**").allowedOrigins("http://localhost:4200").
//	            allowedMethods("POST, GET, OPTIONS, DELETE","PUT").
//	            allowedHeaders("*")
//	            .allowCredentials(true)
//	            .maxAge(3600);
//	         }
//	      };
	 //}
}
