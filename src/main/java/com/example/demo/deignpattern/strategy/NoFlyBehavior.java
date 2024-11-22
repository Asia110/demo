package com.example.demo.deignpattern.strategy;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/9/12 18:51
 * @Description:
 */
public class NoFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("不会飞。。。");
    }
}
