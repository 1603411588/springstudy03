package com.liuyi.cap3;

import lombok.Data;

@Data
public class DecorateBean {

    private String name;

    private Integer age;

    private String password;

    private String sex;

    public DecorateBean(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
