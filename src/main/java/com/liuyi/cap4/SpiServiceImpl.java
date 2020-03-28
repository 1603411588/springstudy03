package com.liuyi.cap4;

public class SpiServiceImpl implements SpiService {
    public SpiServiceImpl() {
        super();
    }

    @Override
    public String method1(String name) {
        System.out.println(" hello " + name);
        return "hello " + name;
    }
}
