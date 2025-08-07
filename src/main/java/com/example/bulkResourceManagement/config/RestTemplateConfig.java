package com.example.bulkResourceManagement.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.StringHttpMessageConverter;

import java.nio.charset.StandardCharsets;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.additionalMessageConverters(new StringHttpMessageConverter(StandardCharsets.UTF_8)).build();
    }
}
