package com.tw.spring.custom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(basePackages = "com.tw.spring.custom", useDefaultFilters = false,
    includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Service.class})
    })
public class CustomConfig {

    @Bean
    public Person person01() {
        return new Person();
    }
}
