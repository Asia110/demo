package com.example.demo.deignpattern.iterator;

import java.util.Iterator;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/21 17:37
 * @Description:
 */
public interface College {

    String getName();

    void addDepartment(String name, String desc);

    Iterator createIterator();
}
