package com.example.demo.deignpattern.observer;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/23 13:57
 * @Description:
 */
public interface Observer {
    void update(float temperatrue,float pressure, float humidity);
}
