package com.example.demo.deignpattern.factory.abstractFactory.factory;

import com.example.demo.deignpattern.factory.abstractFactory.pizza.BJGreeKPizza;
import com.example.demo.deignpattern.factory.abstractFactory.pizza.BJPaperPizza;
import com.example.demo.deignpattern.factory.abstractFactory.pizza.Pizza;


public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("greek")){
            pizza = new BJGreeKPizza();
            pizza.setName("北京 greek  披萨");
        }else if(orderType.equals("paper")){
            pizza = new BJPaperPizza();
            pizza.setName("北京 paper  披萨");
        }
        return pizza;
    }
}
