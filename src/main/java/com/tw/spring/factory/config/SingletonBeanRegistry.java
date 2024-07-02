package com.tw.spring.factory.config;

public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
