package com.example.demo.deignpattern.factory.simpleFactory.pizza.pizzastore.order;

import com.example.demo.deignpattern.factory.simpleFactory.pizza.CheesePizza;
import com.example.demo.deignpattern.factory.simpleFactory.pizza.GreeKPizza;
import com.example.demo.deignpattern.factory.simpleFactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {


    public OrderPizza(SimpleFactory simpleFactory){

        do {
            String orderType = getType();
            Pizza pizza = simpleFactory.createPizza(orderType);
            if(pizza != null){
                pizza.setName(orderType);
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购pizza 失败，，，");
                break;
            }

        }while (true);
    }

    public String getType(){

        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(" input pizza type");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
