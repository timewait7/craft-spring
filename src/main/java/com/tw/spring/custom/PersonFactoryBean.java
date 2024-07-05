package com.tw.spring.custom;

import com.tw.spring.factory.FactoryBean;

public class PersonFactoryBean<P> implements FactoryBean<Person> {
    @Override
    public Person getObject() throws Exception {
        return new Person();
    }

    @Override
    public Class<?> getObjectClass() throws Exception {
        return Person.class;
    }
}
