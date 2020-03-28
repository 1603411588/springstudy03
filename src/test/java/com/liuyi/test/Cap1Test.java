package com.liuyi.test;

import com.liuyi.cap1.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cap1Test {

    @Test
    public void test1() {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("com/liuyi/cap1/spring.xml");
        Student bean = app.getBean(Student.class);
        System.out.println(bean);
    }
}
