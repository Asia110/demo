package com.example.demo.deignpattern2.template;

public class PeanutSoyaMike extends SoyaMilk{
    @Override
    void addCondiments() {
        System.out.println("加入美味的花生。。。。");
    }

    @Override
    boolean isNeedAddCondiments() {
        return true;
    }
}
