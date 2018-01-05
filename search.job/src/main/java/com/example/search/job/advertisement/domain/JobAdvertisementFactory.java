package com.example.search.job.advertisement.domain;

import com.example.search.job.advertisement.domain.api.CreateAdvertisementCommand;

class JobAdvertisementFactory {

    JobAdvertisement create(final CreateAdvertisementCommand dto) {
        return  JobAdvertisement.builder()
                .city(dto.getCity())
                .description(dto.getDescription())
                .title(dto.getTitle())
                .build();
    }
}
