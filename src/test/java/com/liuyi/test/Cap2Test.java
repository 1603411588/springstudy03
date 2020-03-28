package com.liuyi.test;


import com.liuyi.cap2.Student;
import com.liuyi.cap2.Teacher;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Cap2Test {


    @Test
    public void test3() {
        new FileSystemXmlApplicationContext("");
    }

    @Test
    public void annotation() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext("com.liuyi.cap2");
        Object student = app.getBean("student");
        System.out.println(student);
    }

    @Test
    public void xml() {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("com/liuyi/cap2/spring.xml");
        Student bean = app.getBean(Student.class);
        System.out.println(bean);
        System.out.println(app.getBean(Teacher.class));
    }
}
