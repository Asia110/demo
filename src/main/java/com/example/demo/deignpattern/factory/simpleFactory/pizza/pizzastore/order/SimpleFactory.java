package com.example.demo.deignpattern.factory.simpleFactory.pizza.pizzastore.order;

import com.example.demo.deignpattern.factory.simpleFactory.pizza.CheesePizza;
import com.example.demo.deignpattern.factory.simpleFactory.pizza.GreeKPizza;
import com.example.demo.deignpattern.factory.simpleFactory.pizza.PaperPizza;
import com.example.demo.deignpattern.factory.simpleFactory.pizza.Pizza;

public class SimpleFactory {


    public Pizza createPizza(String orderType){

        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName(orderType);
        }else if(orderType.equals("greek")){
            pizza = new GreeKPizza();
            pizza.setName(orderType);
        }else if(orderType.equals("paper")){
            pizza = new PaperPizza();
            pizza.setName(orderType);
        }
        return pizza;
    }
}
