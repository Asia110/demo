package com.example.demo.deignpattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/21 18:08
 * @Description:
 */
public class OutPutImpl {

    List<College> colleges;

    public OutPutImpl(List<College> colleges){
        this.colleges =colleges;
    }


    //输出学院
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department department =(Department) iterator.next();
            System.out.println(department.getName());
        }
    }

    public void printCollage(){
        Iterator<College> iterator =colleges.iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println("========="+college.getName()+"=============");
            printDepartment(college.createIterator());
        }

    }
}
