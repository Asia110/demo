package com.example.demo.deignpattern2.factory.factoryMethod.order;


import com.example.demo.deignpattern2.factory.factoryMethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    abstract Pizza createPizza(String orderType);

    public String getType(){

        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(" input pizza type");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public OrderPizza(){
        do {
            String orderType = getType();
            Pizza pizza = createPizza(orderType);
            if(pizza != null){
                //pizza.setName(orderType);
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
}
