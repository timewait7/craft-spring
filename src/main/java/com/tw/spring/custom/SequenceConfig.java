package com.tw.spring.custom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SequenceConfig {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public Sequence sequence() {
        return new Sequence();
    }

    @Bean
    public CustomBeanPostProcessor customBeanPostProcessor() {
        return new CustomBeanPostProcessor();
    }

    @Bean
    public Grade grade() {
        return new Grade();
    }
}
