package com.example.demo.deignpattern.factory.abstractFactory.pizza;


public class LDPaperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备 伦敦PaperPizza---");
    }
}