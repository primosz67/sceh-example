package com.example.search.job.advertisement.query;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "job_advertisement", type = "advertisement")
class JobAdvQueryDto {
    @Id
    private String id;

    private String title;
    private String city;
    private String description;
}

