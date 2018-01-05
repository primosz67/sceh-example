package com.example.search.job.advertisement.query;

import com.example.search.job.advertisement.query.api.JobAdvertisementDto;
import org.springframework.data.domain.Page;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/jobs")
@RestController
@RepositoryRestController
@ExposesResourceFor(JobAdvertisementDto.class)
class JobAdvertisementQueryRestController {

    private final JobAdvertisementQueryRepository repository;

    public JobAdvertisementQueryRestController(final JobAdvertisementQueryRepository repository) {
        this.repository = repository;
    }

    @GetMapping(value = "/{id}")
    public JobAdvertisementDto findJob(@PathVariable("id") final String jobId) {
        final JobAdvertisement advertisement = repository.findById(jobId)
                .orElseThrow(() -> new IllegalArgumentException("Cannot find job with id!"));

        return advertisement.createDto();
    }

    @GetMapping(value = {"/", ""})
    public List<JobAdvertisementDto> findJobs() {
        return getAllJobs();
    }

    private List<JobAdvertisementDto> getAllJobs() {
        final Page<JobAdvertisement> all = repository.findAll();
        return all.getContent().stream()
                .map(JobAdvertisement::createDto)
                .collect(Collectors.toList());
    }

}
