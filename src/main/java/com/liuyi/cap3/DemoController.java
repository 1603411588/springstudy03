package com.liuyi.cap3;

import org.springframework.beans.factory.annotation.Autowired;

public class DemoController {

    @Autowired
    public LazyInitBean lazyInitBean;

//    @Autowired
//    public AutowireCandidateBean autowireCandidateBean;

    @Autowired
    public Child child;
}
