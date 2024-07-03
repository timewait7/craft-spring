package com.tw.spring.factory.support;

import com.tw.spring.BeansException;
import com.tw.spring.factory.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
