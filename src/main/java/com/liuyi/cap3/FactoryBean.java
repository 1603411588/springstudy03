package com.liuyi.cap3;

public class FactoryBean {

    public Object create() {
        return new FactoryCreateBean();
    }

    public static class FactoryCreateBean {

    }
}
