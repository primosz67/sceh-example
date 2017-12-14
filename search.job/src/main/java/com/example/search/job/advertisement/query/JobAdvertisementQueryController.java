package com.example.search.job.advertisement.query;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
class JobAdvertisementQueryController {

    private JobAdvertisementQueryRepository repository;

    @RequestMapping(value = "/jobs", method = RequestMethod.GET)
    public Iterable<JobAdvQueryDto> findJob() {
        return repository.findAll();
    }

}
