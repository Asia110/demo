package com.example.demo.deignpattern2.factory.abstractFactory;

import com.example.demo.deignpattern2.factory.abstractFactory.factory.LDFactory;

public class PizzaStore {
    public static void main(String[] args) {
         new OrderPizza(new LDFactory());
    }
}
