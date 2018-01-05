package com.example.search.job;

import org.axonframework.commandhandling.CommandBus;
import org.axonframework.commandhandling.SimpleCommandBus;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.commandhandling.gateway.DefaultCommandGateway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.config.EnableHypermediaSupport;

import static org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType.HAL;

@SpringBootApplication
@EnableHypermediaSupport(type = HAL)
public class App {

    public static void main(final String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public CommandGateway commandGateway() {
        final CommandBus commandBus = new SimpleCommandBus();
        return new DefaultCommandGateway(commandBus);
    }

}
