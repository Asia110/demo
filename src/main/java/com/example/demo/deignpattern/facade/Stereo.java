package com.example.demo.deignpattern.facade;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/7/31 18:22
 * @Description:
 */
public class Stereo {

    private static Stereo istance = new Stereo();

    public static Stereo getInstance(){
        return istance;
    }

    public void on(){
        System.out.println("Stereo on");
    }

    public void off(){
        System.out.println("Stereo off");
    }

    public void up(){
        System.out.println("Stereo up");
    }
}
