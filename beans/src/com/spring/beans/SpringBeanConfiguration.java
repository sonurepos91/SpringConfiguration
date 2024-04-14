package com.spring.beans;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class SpringBeanConfiguration {

    public static void main (String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("IOC Container Created");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(bean -> System.out.println(bean));
        context.getBean(Student.class);
        context.close();
    }
}
