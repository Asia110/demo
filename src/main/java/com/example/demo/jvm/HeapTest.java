package com.example.demo.jvm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/10/16 9:42
 * @Description:
 */
public class HeapTest {

    byte[] buffer = new byte[new Random().nextInt(1024*1024)];

    public static void main(String[] args) {
//        ArrayList<HeapTest> list = new ArrayList<>();
//        while (true){
//            list.add(new HeapTest());
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

        List<byte[]> list = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            byte [] arr = new byte[1024 * 1024];
            list.add(arr);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
