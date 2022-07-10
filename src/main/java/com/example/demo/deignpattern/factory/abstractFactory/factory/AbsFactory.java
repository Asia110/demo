package com.example.demo.deignpattern.factory.abstractFactory.factory;

import com.example.demo.deignpattern.factory.abstractFactory.pizza.Pizza;

public interface AbsFactory {

    Pizza createPizza(String orderType);
}
