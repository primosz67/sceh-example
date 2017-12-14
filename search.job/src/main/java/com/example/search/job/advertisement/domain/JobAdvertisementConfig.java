package com.example.search.job.advertisement.domain;

import com.example.search.job.advertisement.domain.api.JobAdvertisementService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class JobAdvertisementConfig {

    @Bean
    public JobAdvertisementService jobAdvertisementService(final JobAdvertisementRepository jobAdvertisementRepository) {
        return new JobAdvertisementServiceImpl(jobAdvertisementRepository, jobAdvertisementFactory());
    }

    @Bean
    public JobAdvertisementFactory jobAdvertisementFactory() {
        return new JobAdvertisementFactory();
    }

}
