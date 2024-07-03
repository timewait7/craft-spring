package com.tw.spring.custom;

import com.tw.spring.factory.FactoryBean;

import java.time.LocalDateTime;

public class NextDayFactoryBean implements FactoryBean<LocalDateTime> {
    @Override
    public LocalDateTime getObject() throws Exception {
       return LocalDateTime.now().plusDays(1);
    }

    @Override
    public Class<?> getObjectClass() throws Exception {
        return LocalDateTime.class;
    }
}
