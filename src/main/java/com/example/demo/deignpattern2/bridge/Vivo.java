package com.example.demo.deignpattern2.bridge;

public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("vivo 手机 open。。。。。。");
    }

    @Override
    public void call() {
        System.out.println("vivo 手机 call。。。。。。");

    }

    @Override
    public void close() {
        System.out.println("vivo 手机 close。。。。。。");

    }
}
