package com.example.demo.deignpattern2.adapter.objectadapter;


public class client {

    public static void main(String[] args) {

        Phone phone = new Phone();
        phone.charge(new VoltageAdapter(new Voltage220V()));



    }
}
