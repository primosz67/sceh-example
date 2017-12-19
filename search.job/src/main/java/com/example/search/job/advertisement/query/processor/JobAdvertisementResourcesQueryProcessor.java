package com.example.search.job.advertisement.query.processor;

import com.example.search.job.advertisement.query.api.JobAdvertisementDto;
import org.springframework.hateoas.EntityLinks;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.hateoas.Resources;
import org.springframework.stereotype.Component;

@Component
class JobAdvertisementResourcesQueryProcessor implements ResourceProcessor<Resources<JobAdvertisementDto>> {

    private final EntityLinks entityLinks;

    public JobAdvertisementResourcesQueryProcessor(final EntityLinks entityLinks) {
        this.entityLinks = entityLinks;
    }

    @Override
    public Resources<JobAdvertisementDto> process(final Resources<JobAdvertisementDto> resource) {
        resource.add(entityLinks.linkToCollectionResource(JobAdvertisementDto.class).withSelfRel());
        return resource;
    }
}
