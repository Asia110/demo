package com.example.demo.deignpattern.iterator;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/21 17:10
 * @Description:
 */
public class Department {

    private String name;

    private String desc;

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
