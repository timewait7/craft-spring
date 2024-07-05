package com.tw.spring.custom;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Teacher {

    public Teacher() {
        System.out.println("teacher...constructor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("teacher...postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("teacher...preDestroy");
    }
}
