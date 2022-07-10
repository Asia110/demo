package com.example.demo.deignpattern.factory.simpleFactory.pizza;

public class GreeKPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备 GreeKPizza ----");
    }
}
