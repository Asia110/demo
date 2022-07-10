package com.example.demo.deignpattern.factory.abstractFactory;

import com.example.demo.deignpattern.factory.abstractFactory.factory.AbsFactory;
import com.example.demo.deignpattern.factory.abstractFactory.pizza.Pizza;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    public OrderPizza(AbsFactory factory){
        do {
            String orderType = getType();
            Pizza pizza =factory.createPizza(orderType);
            if(pizza != null){
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
