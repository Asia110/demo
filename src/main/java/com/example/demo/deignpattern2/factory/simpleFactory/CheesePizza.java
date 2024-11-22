package com.example.demo.deignpattern2.factory.simpleFactory;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备 CheesePizza ====");
    }
}
