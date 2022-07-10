package com.example.demo.deignpattern.factory.factoryMethod.order;


import com.example.demo.deignpattern.factory.factoryMethod.pizza.*;

public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("greek")){
            pizza = new LDGreeKPizza();
            pizza.setName("伦敦 greek  披萨");
        }else if(orderType.equals("paper")){
            pizza = new LDPaperPizza();
            pizza.setName("伦敦 paper  披萨");
        }
        return pizza;
    }
}
