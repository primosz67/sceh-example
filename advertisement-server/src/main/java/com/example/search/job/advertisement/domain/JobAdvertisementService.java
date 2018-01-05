package com.example.search.job.advertisement.domain;

import  com.example.search.job.advertisement.api.CreateAdvertisementCommand;

class JobAdvertisementService {

    private final JobAdvertisementRepository repository;
    private final JobAdvertisementFactory factory;

    JobAdvertisementService(final JobAdvertisementRepository repository, final JobAdvertisementFactory factory) {
        this.repository = repository;
        this.factory = factory;
    }

    void save(final CreateAdvertisementCommand command) {
        repository.save(factory.create(command));
    }
}
