package com.example.demo.deignpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/23 13:53
 * @Description:
 */
public class WeatherData implements Subject{

    private float temperatrue;
    private float pressure;
    private float humidity;

    private List<Observer> observers;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    public void  setData(float temperatrue,float pressure, float humidity){
        this.temperatrue=temperatrue;
        this.pressure=temperatrue;
        this.humidity=humidity;
        dataChange();
    }

    public void dataChange(){
        notifyObserver();
    }

    @Override
    public void redisterObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.temperatrue,this.pressure,this.humidity);
        }
    }
}
