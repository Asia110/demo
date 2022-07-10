package com.example.demo.deignpattern.factory.abstractFactory;

import com.example.demo.deignpattern.factory.abstractFactory.factory.BJFactory;
import com.example.demo.deignpattern.factory.abstractFactory.factory.LDFactory;

public class PizzaStore {

    public static void main(String[] args) {
        new OrderPizza(new LDFactory());
    }
}
