package com.example.demo.deignpattern2.adapter.classadapter;

public class VoltageAdapter extends  Voltage220V implements Ivoltage5V{
    @Override
    public int output5V() {
        System.out.println("使用类适配器---");
        int src = output220V();
        int out =src/44;
        return out;
    }
}
