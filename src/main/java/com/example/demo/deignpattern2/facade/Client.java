package com.example.demo.deignpattern2.facade;

public class Client {

    public static void main(String[] args) {

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();


        homeTheaterFacade.ready();
        homeTheaterFacade.play();

        homeTheaterFacade.pause();

        homeTheaterFacade.end();

    }
}
