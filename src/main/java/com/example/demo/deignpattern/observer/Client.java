package com.example.demo.deignpattern.observer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/23 14:59
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData();
        weatherData.redisterObserver(currentConditions);

        System.out.println("============================");
        Baidu baidu = new Baidu();
        weatherData.redisterObserver(baidu);
        weatherData.setData(10,20,30);

        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();


    }
}
