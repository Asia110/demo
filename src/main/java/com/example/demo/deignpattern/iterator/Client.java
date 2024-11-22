package com.example.demo.deignpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/21 21:28
 * @Description:
 */
public class Client {
    public static void main(String[] args) {

        List<College> collegeList = new ArrayList<>();
        ComputerCollage computerCollage = new ComputerCollage();
        InfoCollage infoCollage = new InfoCollage();

        collegeList.add(computerCollage);
        collegeList.add(infoCollage);
        OutPutImpl outPut= new OutPutImpl(collegeList);
        outPut.printCollage();
    }
}
