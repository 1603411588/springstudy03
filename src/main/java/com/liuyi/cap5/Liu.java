package com.liuyi.cap5;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Data
@Component
@Lazy
public class Liu {

    public Liu() {
        System.out.println("Liu constructor......");
    }

    private String name;


}
