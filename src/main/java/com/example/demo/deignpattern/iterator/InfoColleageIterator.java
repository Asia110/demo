package com.example.demo.deignpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/21 17:31
 * @Description:
 */
public class InfoColleageIterator implements Iterator {

    List<Department> departments;
    int postion = -1;

    public InfoColleageIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (postion >= departments.size()-1) {
            return false;
        }
        postion += 1;
        return true;
    }

    @Override
    public Object next() {
        return departments.get(postion);
    }
}
