package com.liuyi.test;

import com.liuyi.cap6.MyFactoryBean;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap6Test {

    @Test
    public void test1() {
        AnnotationConfigApplicationContext ap = new AnnotationConfigApplicationContext(MyFactoryBean.class);
        Object myFactoryBean = ap.getBean("myFactoryBean");
        System.out.println(myFactoryBean);
        Object myFactoryBean2 = ap.getBean("&myFactoryBean");
        System.out.println(myFactoryBean2);
    }
}
