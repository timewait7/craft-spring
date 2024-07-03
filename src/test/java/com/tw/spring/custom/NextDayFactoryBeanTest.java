package com.tw.spring.custom;

import com.tw.spring.factory.config.BeanDefinition;
import com.tw.spring.factory.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class NextDayFactoryBeanTest {

    @Test
    public void test_getObject() throws Exception {
        final DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        final BeanDefinition beanDefinition = new BeanDefinition(NextDayFactoryBean.class);
        beanFactory.registerBeanDefinition("nextDayFactoryBean", beanDefinition);
        final NextDayFactoryBean nextDayFactoryBean = (NextDayFactoryBean) beanFactory.getBean("nextDayFactoryBean");
        final LocalDateTime localDateTime = nextDayFactoryBean.getObject();
        System.out.println(localDateTime);
    }
}
