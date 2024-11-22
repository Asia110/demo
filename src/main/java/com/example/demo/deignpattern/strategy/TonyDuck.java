package com.example.demo.deignpattern.strategy;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/9/12 19:01
 * @Description:
 */
public class TonyDuck extends Duck{

    public TonyDuck(){
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void fly() {
        flyBehavior.fly();
    }
}
