package com.tw.spring.custom;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {

    String name;

    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }

    public void init() {
        System.out.println("init " + name);
    }

    public void destroy() {
        System.out.println("destroy " + name);
    }
}
