package com.example.demo.deignpattern.iterator;

import java.util.Iterator;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/21 17:39
 * @Description:
 */
public class ComputerCollage implements College{

    Department[] departments;



    int numOfDepartment =0; //保存当前数组对象个数

    public ComputerCollage(){
        departments = new Department[5];
        addDepartment("java 技术","java");
        addDepartment("PHP 技术","PHP");
        addDepartment("Python 技术","Python");
        addDepartment("VUE 技术","VUE");

    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departments[numOfDepartment]=department;
        numOfDepartment +=1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerIterator(departments);
    }
}
