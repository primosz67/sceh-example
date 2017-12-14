package com.example.search.job.advertisement.query;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

interface JobAdvertisementQueryRepository extends ElasticsearchRepository<JobAdvQueryDto, String> {
}
