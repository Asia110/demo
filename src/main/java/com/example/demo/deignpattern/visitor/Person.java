package com.example.demo.deignpattern.visitor;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/21 9:30
 * @Description:
 */
public abstract class Person {

    public abstract void accept(Action action);
}
