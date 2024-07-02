package com.tw.spring.factory.support;

import com.tw.spring.BeansException;
import com.tw.spring.factory.BeanFactory;
import com.tw.spring.factory.config.BeanDefinition;

public abstract class AbstractBeanFactory
    extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) {
        final Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        final BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
