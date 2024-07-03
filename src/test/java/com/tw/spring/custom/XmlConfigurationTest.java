package com.tw.spring.custom;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigurationTest {

    @Test
    public void test_getPerson() {
        final ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        final Object person = applicationContext.getBean("person");
        System.out.println(person);
    }
}
