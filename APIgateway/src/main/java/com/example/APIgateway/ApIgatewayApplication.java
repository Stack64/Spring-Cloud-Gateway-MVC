package com.example.APIgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;
import static org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions.route;
import static org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions.http;
@SpringBootApplication
public class ApIgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApIgatewayApplication.class, args);
	}
	@Bean
    public RouterFunction<ServerResponse> routeToServiceA() {
        return route().GET("/serviceA/getMessage", http("http://localhost:8081")).build();
    }
	@Bean
    public RouterFunction<ServerResponse> routeToServiceB() {
        return route().GET("/serviceB/getMessage", http("http://localhost:8082")).build();
    }
}
