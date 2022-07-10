package com.example.demo.deignpattern.factory.simpleFactory.pizza.pizzastore.order;

public class PizzaStore {

    public static void main(String[] args) {
            OrderPizza orderPizza = new OrderPizza(new SimpleFactory());
    }
}
