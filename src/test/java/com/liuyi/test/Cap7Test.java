package com.liuyi.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Cap7Test {

    @Test
    public void test1() throws IOException {
        AnnotationConfigApplicationContext ap = new AnnotationConfigApplicationContext("com.liuyi.cap7");
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " ---> " + ap.getBean("scopeBean1"));
                System.out.println(Thread.currentThread().getName() + " ---> " + ap.getBean("scopeBean1"));
            }).start();
        }
        System.in.read();
    }
}
