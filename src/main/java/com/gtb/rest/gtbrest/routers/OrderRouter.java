package com.gtb.rest.gtbrest.routers;

import com.gtb.rest.gtbrest.handlers.OrderHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class OrderRouter {
    @Bean
    public RouterFunction<ServerResponse> route(OrderHandler handler){
        return RouterFunctions
                .route(GET("/order").and(accept(MediaType.APPLICATION_JSON)), handler::findAll)
                .andRoute(GET("/order/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::findById)
                .andRoute(POST("/order").and(accept(MediaType.APPLICATION_JSON)), handler::save);
    }
}
