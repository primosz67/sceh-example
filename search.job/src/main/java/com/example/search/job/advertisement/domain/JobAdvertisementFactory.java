package com.example.search.job.advertisement.domain;

import com.example.search.job.advertisement.domain.api.CreateAdvertisementDto;

class JobAdvertisementFactory {

    JobAdvertisement create(final CreateAdvertisementDto dto) {
        return  JobAdvertisement.builder()
                .city(dto.getCity())
                .description(dto.getDescription())
                .title(dto.getTitle())
                .build();
    }
}
