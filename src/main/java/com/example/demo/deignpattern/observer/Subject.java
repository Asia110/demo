package com.example.demo.deignpattern.observer;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/23 13:56
 * @Description:
 */
public interface Subject {

    void redisterObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
