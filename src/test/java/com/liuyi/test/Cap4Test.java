package com.liuyi.test;

import com.liuyi.cap4.SpiService;
import org.junit.Test;

import java.util.ServiceLoader;

public class Cap4Test {

    @Test
    public void test() {
        ServiceLoader<SpiService> load = ServiceLoader.load(SpiService.class);
        for (SpiService spiService : load) {
            spiService.method1("liuyi");
        }
    }
}
