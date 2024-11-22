package com.example.demo.deignpattern.facade;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/7/31 18:25
 * @Description:
 */
public class TheaterLight {

    private static TheaterLight istance = new TheaterLight();

    public static TheaterLight getInstance(){
        return istance;
    }

    public void on(){
        System.out.println("TheaterLight on");
    }

    public void off(){
        System.out.println("TheaterLight off");
    }
    public void dim(){
        System.out.println("TheaterLight..dim...");
    }

    public void bright(){
        System.out.println("TheaterLight bright....");
    }
}
