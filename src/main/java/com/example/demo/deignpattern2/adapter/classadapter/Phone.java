package com.example.demo.deignpattern2.adapter.classadapter;

public class Phone {

    public void charge(Ivoltage5V ivoltage5V){

        if(ivoltage5V.output5V()==5){
            System.out.println("电压是5V 可以充电---");
        }else {
            System.out.println("不符合5v电压 不可以充电");
        }
    }
}
