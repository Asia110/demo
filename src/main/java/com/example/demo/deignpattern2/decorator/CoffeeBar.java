package com.example.demo.deignpattern2.decorator;

public class CoffeeBar {

    public static void main(String[] args) {

        Drink drink = new LongBlack();
        System.out.println(drink.getDes()+"的费用:"+drink.cost());

        drink = new Milk(drink);

        System.out.println(drink.getDes()+" 的费用:"+drink.cost());

        drink= new Soy(drink);
        System.out.println(drink.getDes()+" 的费用:"+drink.cost());

        drink= new Chocolate(drink);
        System.out.println(drink.getDes()+" 的费用:"+drink.cost());
        drink= new Chocolate(drink);
        System.out.println(drink.getDes()+" 的费用:"+drink.cost());



    }
}
