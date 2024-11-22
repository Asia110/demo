package com.example.demo.deignpattern2.factory.factoryMethod.order;


import com.example.demo.deignpattern2.factory.factoryMethod.pizza.BJGreeKPizza;
import com.example.demo.deignpattern2.factory.factoryMethod.pizza.BJPaperPizza;
import com.example.demo.deignpattern2.factory.factoryMethod.pizza.Pizza;


public class BJOrderPizza extends OrderPizza{


    @Override
    Pizza createPizza(String orderType) {
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
