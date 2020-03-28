package com.liuyi.test;


import com.liuyi.cap3.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cap3Test {


    ClassPathXmlApplicationContext app;

    @Before
    public void before() {
        app = new ClassPathXmlApplicationContext("com/liuyi/cap3/spring.xml");
    }


    @Test
    public void decorateBeanTest(){
        DecorateBean bean = app.getBean(DecorateBean.class);
        System.out.println(bean);
    }

    @Test
    public void replaceMethodTest() {
        ReplaceMethodBean bean = app.getBean(ReplaceMethodBean.class);
        bean.method("liuyi");
        bean.method(11);
    }

    @Test
    public void lookupMethodTest() {
        LookupMethodBean bean = app.getBean(LookupMethodBean.class);
        System.out.println(bean);
        bean.showSex();
    }

    @Test
    public void factoryBeanTest() {
        FactoryBean.FactoryCreateBean bean = app.getBean(FactoryBean.FactoryCreateBean.class);
        System.out.println(bean);

        //System.out.println(app.getBean("&factoryCreateBean"));

    }

    @Test
    public void initDestroyBeanTest() throws InterruptedException {
        Thread.sleep(500);
        app.close();
    }

    @Test
    public void autowireCandidateTest() {
        System.out.println(app.getBean(AutowireCandidateBean.class));
    }

    /**
     * lazy_init:
     * 只有context.getBean使用时，才初始化bean
     */
    @Test
    public void lazyInitTest() {
        DemoController bean = app.getBean(DemoController.class);
        System.out.println(bean.lazyInitBean);
        System.out.println(app.getBean(LazyInitBean.class));
    }

    @Test
    public void xml() {

        Child bean = app.getBean(Child.class);
        System.out.println(bean);
//        Parent bean1 = app.getBean(Parent.class);
//        System.out.println(bean1);

        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        for (String be : beanDefinitionNames) {
            System.out.println(be);
        }
    }
}
