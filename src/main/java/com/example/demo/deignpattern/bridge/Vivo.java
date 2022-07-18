package com.example.demo.deignpattern.bridge;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/7/17 19:07
 * @Description:
 */
public class Vivo implements Brand{

    @Override
    public void open() {
        System.out.println("Vivo手机 open...");
    }

    @Override
    public void call() {
        System.out.println("Vivo手机 call...");
    }

    @Override
    public void close() {
        System.out.println("Vivo手机 close...");
    }
}
