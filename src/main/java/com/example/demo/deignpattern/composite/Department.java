package com.example.demo.deignpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/7/31 0:24
 * @Description:
 */
public class Department extends OrganizationComponent{


    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }



    @Override
    protected void print() {
        System.out.println("==========="+getName()+"============");

    }
}
