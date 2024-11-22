package com.example.demo.deignpattern2.bridge;

public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("XiaoMi 手机 open。。。。。。");
    }

    @Override
    public void call() {
        System.out.println("XiaoMi 手机 call。。。。。。");
    }

    @Override
    public void close() {
        System.out.println("XiaoMi 手机 close。。。。。。");
    }
}
