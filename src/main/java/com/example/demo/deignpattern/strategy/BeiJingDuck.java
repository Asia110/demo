package com.example.demo.deignpattern.strategy;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/9/12 18:57
 * @Description:
 */
public class BeiJingDuck extends Duck{

    public BeiJingDuck(){
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void fly() {
        flyBehavior.fly();
    }
}
