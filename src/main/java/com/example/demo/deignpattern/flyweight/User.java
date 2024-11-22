package com.example.demo.deignpattern.flyweight;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/7 23:00
 * @Description:
 */
public class User {

    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
