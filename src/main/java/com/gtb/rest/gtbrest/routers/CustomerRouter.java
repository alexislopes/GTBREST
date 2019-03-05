package com.gtb.rest.gtbrest.routers;

import com.gtb.rest.gtbrest.handlers.CustomerHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class CustomerRouter {
    @Bean
    public RouterFunction<ServerResponse> route(CustomerHandler handler){
        return RouterFunctions
                .route(GET("/costumer").and(accept(MediaType.APPLICATION_JSON)), handler::findAll)
                .andRoute(GET("/costumer/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::findById)
                .andRoute(POST("/costumer").and(accept(MediaType.APPLICATION_JSON)), handler::save);
    }
}
