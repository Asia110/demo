package com.example.demo.deignpattern.adapter.classadapter;

public class client {

    public static void main(String[] args) {

        System.out.println("类适配器~~~~");
        Phone phone = new Phone();

        phone.charge(new ValtageAdapter());
    }
}