package com.tw.spring.custom;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigurationTest {

    @Test
    public void test_getPerson() {
        final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CustomConfig.class);
        final Object person = applicationContext.getBean("person01");
        System.out.println(person);
        for (String name : applicationContext.getBeanNamesForType(Person.class)) {
            System.out.println(name);
        }
    }
}
