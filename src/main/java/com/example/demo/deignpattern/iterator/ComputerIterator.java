package com.example.demo.deignpattern.iterator;

import java.util.Iterator;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/21 17:13
 * @Description:
 */
public class ComputerIterator implements Iterator {
    Department [] departments;

    int position =0;

    public ComputerIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if(position >= departments.length || departments[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position +=1;
        return department;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
