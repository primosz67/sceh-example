package com.example.search.job.advertisement.query;

import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

interface JobAdvertisementQueryRepository extends ElasticsearchRepository<JobAdvertisement, String> {

    @Override
    Page<JobAdvertisement> findAll();
}
