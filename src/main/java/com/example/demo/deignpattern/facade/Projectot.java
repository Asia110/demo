package com.example.demo.deignpattern.facade;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/7/31 18:17
 * @Description:
 */
public class Projectot {

    private static Projectot istance = new Projectot();

    public static Projectot getInstance(){
        return istance;
    }

    public void on(){
        System.out.println("Projectot on");
    }

    public void off(){
        System.out.println("Projectot off");
    }
    public void focus(){
        System.out.println("Projectot is focus.....");
    }
}
