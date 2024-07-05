package com.tw.spring.custom;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 执行顺序：
 * @PostConstruct -> InitializingBean#afterPropertiesSet -> initMethod
 * @PreDestry -> DisposableBean#destroy -> destroyMethod
 */
public class Sequence implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean...destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean...afterPropertiesSet");
    }

    public void initMethod() {
        System.out.println("initMethod");
    }

    public void destroyMethod() {
        System.out.println("destroyMethod");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("preDestroy");
    }
}
