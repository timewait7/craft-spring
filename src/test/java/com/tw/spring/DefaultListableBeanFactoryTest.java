package com.tw.spring;

import com.tw.spring.factory.config.BeanDefinition;
import com.tw.spring.factory.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DefaultListableBeanFactoryTest {

    @Test
    public void testRegisterAndGetBean() {
        final DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        final BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        beanFactory.registerBeanDefinition("helloService", beanDefinition);
        final HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        Assertions.assertEquals(helloService.sayHi(), "hi");
    }
}
