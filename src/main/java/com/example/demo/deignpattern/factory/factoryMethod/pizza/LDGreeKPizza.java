package com.example.demo.deignpattern.factory.factoryMethod.pizza;


public class LDGreeKPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备 伦敦GreeKPizza ----");
    }
}