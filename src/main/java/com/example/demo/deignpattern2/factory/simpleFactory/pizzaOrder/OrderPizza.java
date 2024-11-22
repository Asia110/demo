package com.example.demo.deignpattern2.factory.simpleFactory.pizzaOrder;

import com.example.demo.deignpattern2.factory.simpleFactory.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class OrderPizza {

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

    public OrderPizza(SimpleFactory simpleFactory){
        do {
            String orderType = getType();
            Pizza pizza = simpleFactory.createPizza(orderType);
            if(pizza != null){
                //pizza.setName(orderType);
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.boxing();
            }else {
                System.out.println("订购pizza 失败，，，");
                break;
            }

        }while (true);
    }
}
