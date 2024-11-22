package com.example.demo.deignpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/21 18:00
 * @Description:
 */
public class InfoCollage implements College{

    List<Department> departments;

    public InfoCollage(){
        departments = new ArrayList<>();
        addDepartment("信息技术","信息");
        addDepartment("信息网络技术","信息");
        addDepartment("计算机原理技术","信息");


    }

    @Override
    public String getName() {
        return "信息学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department =new Department(name,desc);
        departments.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoColleageIterator(departments);
    }
}
