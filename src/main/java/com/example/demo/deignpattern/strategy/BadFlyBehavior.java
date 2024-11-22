package com.example.demo.deignpattern.strategy;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/9/12 18:50
 * @Description:
 */
public class BadFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("飞的不是特别好。。。");
    }
}
