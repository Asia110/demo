package com.example.demo.deignpattern.visitor;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/21 10:36
 * @Description:
 */
public class Wait extends Action{
    @Override
    void getManResult(Man man) {
        System.out.println("男人给的评价是待定！");
    }

    @Override
    void getWomanResult(Woman woman) {
        System.out.println("女人给的评价是待定！");

    }
}
