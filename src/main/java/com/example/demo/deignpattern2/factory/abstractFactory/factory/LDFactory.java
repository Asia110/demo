package com.example.demo.deignpattern2.factory.abstractFactory.factory;

import com.example.demo.deignpattern.factory.abstractFactory.pizza.LDGreeKPizza;
import com.example.demo.deignpattern.factory.abstractFactory.pizza.LDPaperPizza;
import com.example.demo.deignpattern.factory.abstractFactory.pizza.Pizza;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if(orderType.equals("greek")){
            pizza = new LDGreeKPizza();
            pizza.setName("伦敦 Greek 披萨");
        }else if(orderType.equals("paper")){
            pizza= new LDPaperPizza();
            pizza.setName("伦敦 paper 披萨");
        }
        return pizza;
    }
}
