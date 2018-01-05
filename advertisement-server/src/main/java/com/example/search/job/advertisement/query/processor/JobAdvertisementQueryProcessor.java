package com.example.search.job.advertisement.query.processor;

import com.example.search.job.advertisement.query.api.JobAdvertisementDto;
import org.springframework.hateoas.EntityLinks;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.stereotype.Component;

@Component
class JobAdvertisementQueryProcessor implements ResourceProcessor<Resource<JobAdvertisementDto>> {

    private final EntityLinks entityLinks;

    public JobAdvertisementQueryProcessor(final EntityLinks entityLinks) {
        this.entityLinks = entityLinks;
    }

    @Override
    public Resource<JobAdvertisementDto> process(final Resource<JobAdvertisementDto> resource) {
        final String jobId = resource.getContent().getJobId();

        resource.add(entityLinks.linkToSingleResource(JobAdvertisementDto.class, jobId).withSelfRel());
        resource.add(entityLinks.linkToCollectionResource(JobAdvertisementDto.class).withRel("all"));
        return resource;
    }
}
