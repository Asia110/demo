package com.example.demo.deignpattern2.template;

public class RedBeanSoyaMike extends SoyaMilk{
    @Override
    void addCondiments() {
        System.out.println("加入美味的红豆。。。");
    }

    @Override
    boolean isNeedAddCondiments() {
        return true;
    }
}
