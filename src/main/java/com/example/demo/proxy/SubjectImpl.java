package com.example.demo.proxy;

/**
 * @author chenyaguo
 * @date 2021/2/2 14:38
 */
public class SubjectImpl implements Subject {
    @Override
    public String sayHello() {
        System.out.println("Hello world");
        return "success";
    }

    @Override
    public String sayYes() {
        System.out.println("yes  yes  yes");
        return "yes";
    }
}
