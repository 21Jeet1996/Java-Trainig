package com.APIGateway.swagger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;


@Component
@Primary
public class SwaggerProvider implements SwaggerResourcesProvider{

	public static final String apiUrl="v3/api-docs";
	public static final String gateway="flight-gateway";
	public final RouteDefinitionLocator locator;
	
	public SwaggerProvider(RouteDefinitionLocator locator) {
		this.locator=locator;
	}

	@Override
	public List<SwaggerResource> get() {
		// TODO Auto-generated method stub
		String apiGateway="/"+gateway;
		List<SwaggerResource> list=new ArrayList<>();
		locator.getRouteDefinitions().subscribe(routeDefinition->{
			String resource=routeDefinition.getId();
			String location=routeDefinition.getPredicates().get(0).getArgs().get("_genkey_0").replace("/**",apiUrl);
			if(location.contains(apiGateway)) {
				location.replace(apiGateway, "");
			}
			list.add(swaggerResource(resource,location));
			
		});
		return null;
	}
	
	private SwaggerResource swaggerResource(String name,String location) {
		SwaggerResource swaggerResource=new SwaggerResource();
		swaggerResource.setName(name);
		swaggerResource.setLocation(location);
		swaggerResource.setSwaggerVersion("2.0");
		return swaggerResource;
	}
}
