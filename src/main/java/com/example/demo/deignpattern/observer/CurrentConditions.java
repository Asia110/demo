package com.example.demo.deignpattern.observer;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/23 14:09
 * @Description: 观察者
 */
public class CurrentConditions implements Observer{

    private float temperatrue;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperatrue, float pressure, float humidity) {
        this.temperatrue =temperatrue;
        this.pressure=pressure;
        this.humidity =humidity;
        display();
    }

    public void display(){
        System.out.println("====今天的温度是："+temperatrue+"======");
        System.out.println("====今天的湿度是："+pressure+"======");
        System.out.println("====今天的气压是："+humidity+"======");

    }
}
