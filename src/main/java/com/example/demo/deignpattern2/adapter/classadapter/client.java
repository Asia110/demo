package com.example.demo.deignpattern2.adapter.classadapter;

public class client {

    public static void main(String[] args) {

        System.out.println("类适配器！！！");

        Phone phone = new Phone();

        phone.charge(new VoltageAdapter());
    }
}
