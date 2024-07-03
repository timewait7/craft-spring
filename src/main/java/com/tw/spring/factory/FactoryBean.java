package com.tw.spring.factory;

import org.springframework.lang.Nullable;

public interface FactoryBean<T> {

    @Nullable
    T getObject() throws Exception;

    @Nullable
    Class<?> getObjectClass() throws Exception;

    default boolean isSingleton() {
        return true;
    }
}
