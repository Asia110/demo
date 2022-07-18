package com.example.demo.deignpattern.adapter.objectadapter;

/**
 * 类适配器
 */
public class ValtageAdapter implements Ivoltage5v {

    private Voltage220V voltage220V;

    public ValtageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        System.out.println("使用對象适配器~~~~");
        if (null != voltage220V) {
            int src = voltage220V.output220v();
            int output = src / 44;
            return output;
        }else {
            System.out.println("不是220V电输入~~");
        }
        return 0;
    }
}
