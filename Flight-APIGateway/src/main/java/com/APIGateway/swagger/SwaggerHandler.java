package com.APIGateway.swagger;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient.UriConfiguration;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger.web.SecurityConfigurationBuilder;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;

@RestController
@RequestMapping("/swagger-resources")
public class SwaggerHandler {
	
	@Autowired(required=false)
	private SecurityConfiguration securityConfiguration;
	@Autowired(required=false)
	private UiConfiguration uiConfiguration;
	
	private final SwaggerResourcesProvider swaggerResources;

	public SwaggerHandler(SwaggerResourcesProvider swaggerResources) {
		super();
	
		this.swaggerResources = swaggerResources;
	}
	
	@GetMapping("config/security")
	public Mono<ResponseEntity<SecurityConfiguration>> securityConfiguration(){
		return Mono.just(new ResponseEntity<>(
			Optional.ofNullable(securityConfiguration).orElse(SecurityConfigurationBuilder.builder().build()),HttpStatus.OK
				));
	}
	
	

	@GetMapping("config/ui")
	public Mono<ResponseEntity<UiConfiguration>> uiConfiguration(){
		return Mono.just(new ResponseEntity<>(
			Optional.ofNullable(uiConfiguration).orElse(UiConfigurationBuilder.builder().build()),HttpStatus.OK
				));
	}
	
	@GetMapping("")
	public Mono<ResponseEntity<?>> swaggerResources(){
		return Mono.just(new ResponseEntity<>(swaggerResources.get(),HttpStatus.OK));
	}
	
}
