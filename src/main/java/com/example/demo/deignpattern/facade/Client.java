package com.example.demo.deignpattern.facade;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/7/31 18:45
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();

        System.out.println("==============");
        homeTheaterFacade.pause();

        System.out.println("===================");

        homeTheaterFacade.end();


    }
}
