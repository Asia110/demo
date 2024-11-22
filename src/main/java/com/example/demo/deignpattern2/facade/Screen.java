package com.example.demo.deignpattern2.facade;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/7/31 18:21
 * @Description:
 */
public class Screen {

    private static Screen istance = new Screen();

    public static Screen getInstance(){
        return istance;
    }

    public void up(){
        System.out.println("Screen up");
    }

    public void down(){
        System.out.println("Projectot down");
    }

}
