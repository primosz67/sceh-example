package com.example.search.job.advertisement.domain;

import com.example.search.job.advertisement.domain.api.JobAdvertisementService;
import com.example.search.job.advertisement.domain.api.CreateAdvertisementDto;

class JobAdvertisementServiceImpl implements JobAdvertisementService {

    private final JobAdvertisementRepository repository;
    private final JobAdvertisementFactory factory;

    JobAdvertisementServiceImpl(final JobAdvertisementRepository repository, final JobAdvertisementFactory factory) {
        this.repository = repository;
        this.factory = factory;
    }

    public void save(final CreateAdvertisementDto dto) {
        repository.save(factory.create(dto));
    }
}
