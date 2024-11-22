package com.example.demo.deignpattern.strategy;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/9/12 18:49
 * @Description:
 */
public class GoodFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("飞的相当好。。。。");
    }
}
