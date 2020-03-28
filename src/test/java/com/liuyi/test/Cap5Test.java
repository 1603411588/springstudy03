package com.liuyi.test;

import com.liuyi.cap4.SpiService;
import com.liuyi.cap5.Liu;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ServiceLoader;

public class Cap5Test {

    ClassPathXmlApplicationContext app;

    @Before
    public void before() {
        app = new ClassPathXmlApplicationContext("com/liuyi/cap5/spring.xml");
    }

    @Test
    public void test1(){
        Liu bean = app.getBean(Liu.class);
        System.out.println(bean);
    }
}
