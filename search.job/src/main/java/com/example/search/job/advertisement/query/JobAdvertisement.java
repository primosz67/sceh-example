package com.example.search.job.advertisement.query;

import com.example.search.job.advertisement.query.api.JobAdvertisementDto;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.hateoas.core.Relation;

@Data
@Document(indexName = "job_advertisement", type = "advertisement")
@Relation(collectionRelation = "jobs")
class JobAdvertisement {

    @Id
    private String id;

    private String title;
    private String city;
    private String description;

    JobAdvertisementDto createDto() {
        return new JobAdvertisementDto(id, title, city, description);
    }
}

