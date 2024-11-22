package com.example.demo.deignpattern.facade;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/7/31 18:02
 * @Description:
 */
public class DVDPlayer {

    private static DVDPlayer istance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return istance;
    }

    public void on(){
        System.out.println("dvd on");
    }

    public void off(){
        System.out.println("dvd off");
    }
    public void play(){
        System.out.println("dvd id playing.....");
    }

    public void pause(){
        System.out.println("dvd pause....");
    }



}
