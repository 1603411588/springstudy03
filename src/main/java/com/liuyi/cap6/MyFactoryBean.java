package com.liuyi.cap6;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MyFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new MyFactoryObj();
    }

    @Override
    public Class<?> getObjectType() {
        return MyFactoryObj.class;
    }

    public static class MyFactoryObj {
        
    }
}
