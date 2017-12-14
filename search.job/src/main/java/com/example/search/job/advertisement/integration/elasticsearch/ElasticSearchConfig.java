package com.example.search.job.advertisement.integration.elasticsearch;

import com.google.common.base.Joiner;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.elasticsearch.xpack.XPackPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import java.net.InetAddress;

@Configuration
@EnableElasticsearchRepositories
class ElasticSearchConfig {

    private static final Joiner JOINER = Joiner.on(":");

    private final ElasticSearchConnectionProperties properties;

    public ElasticSearchConfig(final ElasticSearchConnectionProperties properties) {
        this.properties = properties;
    }

    @Bean
    public TransportClient client() throws Exception {
        final Settings esSettings = Settings.builder()
                .put("cluster.name", properties.getClusterName())
                .put("xpack.security.user", getCredential())
                .build();

        final TransportClient client = new PreBuiltTransportClient(esSettings, XPackPlugin.class);
        return client
                .addTransportAddress(
                        new InetSocketTransportAddress(InetAddress.getByName(properties.getHost()), properties.getPort()));
    }

    private String getCredential() {
        return JOINER.join(properties.getUsername(), properties.getPassword());
    }

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() throws Exception {
        return new ElasticsearchTemplate(client());
    }
}
