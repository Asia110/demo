package com.example.demo.deignpattern2.factory.simpleFactory.pizzaOrder;

public class PizzaStore {

    public static void main(String[] args) {

        OrderPizza orderPizza = new OrderPizza(new SimpleFactory());
    }
}
