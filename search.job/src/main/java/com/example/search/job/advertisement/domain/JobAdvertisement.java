package com.example.search.job.advertisement.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@Data
@Builder
@Document(indexName = "job_advertisement", type = "advertisement")
class JobAdvertisement {

    @Id
    private String id;

    private String title;
    private String city;
    private String description;
}


