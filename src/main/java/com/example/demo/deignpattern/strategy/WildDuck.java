package com.example.demo.deignpattern.strategy;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/9/12 18:59
 * @Description:
 */
public class WildDuck extends Duck{

    public WildDuck(){
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void fly() {
        flyBehavior.fly();
    }
}
