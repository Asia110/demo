package com.example.demo.deignpattern.bridge;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/7/17 19:06
 * @Description:
 */
public class XiaoMi implements Brand{
    @Override
    public void open() {
        System.out.println("小米手机 open...");
    }

    @Override
    public void call() {
        System.out.println("小米手机 call...");
    }

    @Override
    public void close() {
        System.out.println("小米手机 close...");
    }
}
