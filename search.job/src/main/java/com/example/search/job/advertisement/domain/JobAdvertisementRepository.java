package com.example.search.job.advertisement.domain;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
interface JobAdvertisementRepository extends ElasticsearchRepository<JobAdvertisement, String> {
    JobAdvertisement findByTitle(String title);
}
