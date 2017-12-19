package com.example.search.job.advertisement.query.processor;

import com.example.search.job.advertisement.query.api.JobAdvertisementDto;
import org.springframework.hateoas.EntityLinks;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.stereotype.Component;

@Component
class JobAdvertisementQueryProcessor implements ResourceProcessor<JobAdvertisementDto> {

    private final EntityLinks entityLinks;

    public JobAdvertisementQueryProcessor(final EntityLinks entityLinks) {
        this.entityLinks = entityLinks;
    }

    @Override
    public JobAdvertisementDto process(final JobAdvertisementDto resource) {
        resource.add(entityLinks.linkToSingleResource(JobAdvertisementDto.class, resource.getJobId()).withSelfRel());
        resource.add(entityLinks.linkToCollectionResource(JobAdvertisementDto.class).withRel("all"));
        return resource;
    }
}
