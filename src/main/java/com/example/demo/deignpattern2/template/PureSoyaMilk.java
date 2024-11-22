package com.example.demo.deignpattern2.template;

public class PureSoyaMilk extends SoyaMilk{
    @Override
    void addCondiments() {

    }

    @Override
    boolean isNeedAddCondiments() {
        return false;
    }
}
