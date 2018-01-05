package com.example.search.job.advertisement.domain;

import  com.example.search.job.advertisement.api.JobAdvertisementFacade;
import  com.example.search.job.advertisement.api.CreateAdvertisementCommand;

class JobAdvertisementFacadeImpl implements JobAdvertisementFacade {

    private final JobAdvertisementService jobAdvertisementService;

    JobAdvertisementFacadeImpl(final JobAdvertisementService jobAdvertisementService) {
        this.jobAdvertisementService = jobAdvertisementService;
    }

    public void save(final CreateAdvertisementCommand command) {
        jobAdvertisementService.save(command);
    }
}
