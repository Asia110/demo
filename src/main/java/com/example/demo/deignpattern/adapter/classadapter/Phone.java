package com.example.demo.deignpattern.adapter.classadapter;

public class Phone {

    public void charge(Ivoltage5v ivoltage5v){
        if(ivoltage5v.output5V()==5){
            System.out.println("电压为5V  可以正常充电~~~");
        }else {
            System.out.println("不符合5v电压，充电失败！！");
        }

    }
}
