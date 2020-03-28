package com.liuyi.cap3;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class ReplaceMethodBean {

    public void method(String param) {
        System.out.println("ReplaceMethodBean param :" + param);
    }

    public void method(Integer param) {
        System.out.println("ReplaceMethodBean param :" + param);
    }

    public static class TargetReplaceBean implements MethodReplacer {

        @Override
        public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
            System.out.println("TargetReplaceBean reimplement");
            return null;
        }
    }
}
