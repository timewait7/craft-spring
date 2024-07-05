package com.tw.spring.custom;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScopeTest {

    @Test
    public void test_scope_singleton() {
        final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeConfig.class);
        applicationContext.close();
    }

    @Test
    public void test_scope_prototype() {
        final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeConfig.class);
        final Object li4 = applicationContext.getBean("li4");
        applicationContext.close();
    }

    @Test
    public void test_initializing_disposable_bean() {
        final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeConfig.class);
        applicationContext.close();
    }

    @Test
    public void test_post_construct_and_pre_destroy() {
        final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeConfig.class);
        applicationContext.close();
    }

    @Test
    public void test_sequence() {
        final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SequenceConfig.class);
        applicationContext.close();
    }
}
