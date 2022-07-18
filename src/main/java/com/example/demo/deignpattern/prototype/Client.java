package com.example.demo.deignpattern.prototype;

public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("多利",10,"black");
        Sheep sheep1 = sheep.clone();
        System.out.println(sheep);
        System.out.println(sheep1);
    }
}
