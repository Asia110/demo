package com.example.demo.deignpattern.factory.abstractFactory.pizza;


public class BJPaperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备 北京PaperPizza---");
    }
}
