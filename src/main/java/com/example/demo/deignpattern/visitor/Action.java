package com.example.demo.deignpattern.visitor;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/21 9:27
 * @Description:
 */
public abstract class Action {

    abstract  void getManResult(Man man);

    abstract void getWomanResult(Woman woman);
}
