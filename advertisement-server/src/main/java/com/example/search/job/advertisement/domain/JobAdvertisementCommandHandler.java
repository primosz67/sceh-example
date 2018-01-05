package com.example.search.job.advertisement.domain;

import  com.example.search.job.advertisement.api.CreateAdvertisementCommand;
import  com.example.search.job.advertisement.api.JobAdvertisementFacade;
import org.axonframework.commandhandling.CommandHandler;

class JobAdvertisementCommandHandler {

    private final JobAdvertisementFacade facade;

    JobAdvertisementCommandHandler(final JobAdvertisementFacade facade) {
        this.facade = facade;
    }

    @CommandHandler
    public void create(final CreateAdvertisementCommand command) {
        facade.save(command);
    }


}
