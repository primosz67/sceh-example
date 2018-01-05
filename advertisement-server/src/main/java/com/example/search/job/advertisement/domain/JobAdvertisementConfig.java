package com.example.search.job.advertisement.domain;

import  com.example.search.job.advertisement.api.JobAdvertisementFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class JobAdvertisementConfig {

    @Bean
    public JobAdvertisementFacade jobAdvertisementService(final JobAdvertisementRepository repository) {
        final JobAdvertisementFactory factory = new JobAdvertisementFactory();
        final JobAdvertisementService service = new JobAdvertisementService(repository, factory);

        return new JobAdvertisementFacadeImpl(service);
    }

    @Bean
    public JobAdvertisementCommandHandler jobAdvertisementCommandHandler(final JobAdvertisementFacade facade) {
        return new JobAdvertisementCommandHandler(facade);
    }

}
