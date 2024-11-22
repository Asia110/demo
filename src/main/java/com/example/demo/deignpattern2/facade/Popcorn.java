package com.example.demo.deignpattern2.facade;

public class Popcorn {

    private static final Popcorn instance = new Popcorn();

    private Popcorn(){

    }

    public static Popcorn getInstance(){
        return instance;
    }


    public void on(){
        System.out.println("popcorn on");
    }

    public void off(){
        System.out.println("popcorn off");
    }
    public void pop(){
        System.out.println("popcorn is poping.....");
    }

}
