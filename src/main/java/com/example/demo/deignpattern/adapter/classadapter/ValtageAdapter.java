package com.example.demo.deignpattern.adapter.classadapter;

/**
 * 类适配器
 */
public class ValtageAdapter extends Voltage220V implements Ivoltage5v{
    @Override
    public int output5V() {
        System.out.println("使用类适配器~~~~");
        int src = output220v();
        int out =src/44;
        return out;
    }
}
