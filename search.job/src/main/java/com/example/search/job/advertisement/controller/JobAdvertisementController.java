package com.example.search.job.advertisement.controller;

import com.example.search.job.advertisement.domain.api.CreateAdvertisementCommand;
import com.example.search.job.advertisement.domain.api.JobAdvertisementFacade;
import org.axonframework.commandhandling.CommandBus;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adv")
class JobAdvertisementController {

    private static final String OK = "OK";

    private final CommandGateway commandGateway;

    JobAdvertisementController(final CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestBody final CreateAdvertisementCommand command) {
        commandGateway.send(command);
        return ResponseEntity.ok(OK);
    }
}
