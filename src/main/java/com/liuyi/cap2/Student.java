package com.liuyi.cap2;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student {

    private String username = "yi.liu2";

    private String password;
}
