package com.example.demo.controller.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/10/19 20:09
 * @Description:
 */
public abstract class ABS {

    @Autowired
    @Qualifier("sub2Service")
    private SuperService superService;

    public void ABSTest(){
        System.out.println("ABSTest--------");
        superService.sayHello();
    }

    abstract void test2();
}
