package com.example.demo.deignpattern2.decorator;

public class Decorator extends Drink{

    private Drink drink;

    public Decorator(Drink drink){
        this.drink = drink;
    }

    @Override
    float cost() {
        return super.getPrice()+drink.cost();
    }

    @Override
    public String getDes() {
        return des +" "+ getPrice()+" && "+drink.getDes();
    }
}
