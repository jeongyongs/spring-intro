package com.jeongyongs;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class Life implements InitializingBean, DisposableBean {
    @Autowired
    private Di di;

    public void say() {
        di.out();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("See ya!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Hi!");
    }
}
