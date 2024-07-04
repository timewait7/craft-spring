package com.tw.spring.custom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "com.tw.spring.custom", useDefaultFilters = false,
    includeFilters = {
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {CustomTypeFilter.class}),
    })
public class CustomConfig {

    @Bean
    public Person person01() {
        return new Person();
    }

    @Conditional(OsNameCondition.class)
    @Bean
    public Person bill() {
        return new Person();
    }
}
