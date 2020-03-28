package com.liuyi.test;

import org.junit.Test;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ScanPackageTest {

    @Test
    public void scan() {
        List<String> strings = scanPackage("com.liuyi.test");
        System.out.println(strings);
    }

    private List<String> scanPackage(String basePackage) {
        URL resource = this.getClass().getClassLoader().getResource(replaceTo(basePackage));
        String file = resource.getFile();
        File f = new File(file);
        List<String> resultList = new ArrayList<>();
        String[] list = f.list();
        for (String path : list) {
            File f2 = new File(file + path);
            if (f2.isDirectory()) {
                resultList.addAll(scanPackage(basePackage + "." + path));
            } else {
                resultList.add(basePackage + "." + path);
            }
        }
        return resultList;
    }

    private String replaceTo(String basepackage) {
        return basepackage.replace("\\.", "/");
    }
}
