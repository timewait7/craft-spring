package com.tw.spring.custom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScopeConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Person zhang3() {
        return Person.builder().name("zhang3").build();
    }

    @Scope("prototype")
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Person li4() {
        return Person.builder().name("li4").build();
    }

    @Bean
    public Student student() {
        return new Student();
    }
}
