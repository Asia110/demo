package com.example.demo.deignpattern2.factory.simpleFactory.pizzaOrder;

import com.example.demo.deignpattern2.factory.simpleFactory.CheesePizza;
import com.example.demo.deignpattern2.factory.simpleFactory.GreeKPizza;
import com.example.demo.deignpattern2.factory.simpleFactory.PaperPizza;
import com.example.demo.deignpattern2.factory.simpleFactory.Pizza;

public class SimpleFactory {

    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName(orderType);
        } else if (orderType.equals("greek")) {
            pizza= new GreeKPizza();
            pizza.setName(orderType);
        } else if (orderType.equals("paper")) {
            pizza = new PaperPizza();
            pizza.setName(orderType);
        }
        return pizza;
    }
}
