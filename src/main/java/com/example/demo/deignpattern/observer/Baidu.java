package com.example.demo.deignpattern.observer;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/23 15:06
 * @Description:
 */
public class Baidu implements Observer{
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
        System.out.println("====百度今天的温度是："+temperatrue+"======");
        System.out.println("====百度今天的湿度是："+pressure+"======");
        System.out.println("====百度今天的气压是："+humidity+"======");

    }
}
