package com.example.search.job.advertisement.query.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.core.Relation;

@Data
@AllArgsConstructor
@Relation("jobs")
public class JobAdvertisementDto extends ResourceSupport {
    private String jobId;
    private String title;
    private String city;
    private String description;
}
