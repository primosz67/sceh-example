package com.example.search.job.advertisement.integration.elasticsearch;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.Objects;

@Component
@Getter
@Setter(AccessLevel.PACKAGE)
class ElasticSearchConnectionProperties {

    @Value("${elasticsearch.host}")
    private String host;

    @Value("${elasticsearch.port}")
    private int port;

    @Value("${elasticsearch.clustername}")
    private String clusterName;

    @Value("${elasticsearch.password}")
    private String password;

    @Value("${elasticsearch.username}")
    private String username;

}
