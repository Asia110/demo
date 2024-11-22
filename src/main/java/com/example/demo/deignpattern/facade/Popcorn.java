package com.example.demo.deignpattern.facade;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/7/31 18:07
 * @Description:
 */
public class Popcorn {

    private static Popcorn istance = new Popcorn();

    public static Popcorn getInstance(){
        return istance;
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
