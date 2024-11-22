package com.example.demo.deignpattern2.adapter.objectadapter;


public class VoltageAdapter implements Ivoltage5v{


    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        System.out.println("使用对象适配器~~~~");
        if(voltage220V != null){
            int src = voltage220V.output220v();
            int output = src/44;
            return output;
        }else {
            System.out.println("不是220v电流输入~~~");
            return 0;
        }

    }
}
