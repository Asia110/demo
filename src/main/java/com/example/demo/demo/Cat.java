package com.example.demo.demo;

/**
 * @author chenyaguo
 * @date 2021/2/19 20:30
 */
public class Cat implements Animals {

    private  int left =4;
    @Override
    public String eat() {
        return  "我是猫 我来吃鱼";
    }
}
