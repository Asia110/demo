package com.example.demo.JUC.other;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/5/17 21:35
 * @Description:
 */
public class ThreadDemo {


    public static void main(String[] args) {

        /**
         * java.util.ConcurrentModificationException
         *
         * List<String> list = new ArrayList<>();
         */

        //解决方案一 使用Vector   List<String> list = new Vector<>();

        //解决方案二 使用  List<String> list = Collections.synchronizedList(new ArrayList<>());

        //解决方案三  List<String> list = new CopyOnWriteArrayList<>(); 写时复制技术
//        List<String> list = new CopyOnWriteArrayList<>();
//
//        for (int i = 0; i < 30; i++) {
//            new Thread(()->{
//
//                list.add(UUID.randomUUID().toString().substring(0,5));
//                System.out.println(list);
//
//            },String.valueOf(i).toString()).start();
//        }

//        Set<String> set = new CopyOnWriteArraySet<>();
//
//        for (int i = 0; i < 30; i++) {
//            new Thread(()->{
//                set.add(UUID.randomUUID().toString().substring(0,5));
//                System.out.println(set);
//
//            },String.valueOf(i).toString()).start();
//        }

        Map<String,String> map = new ConcurrentHashMap<>();

        for (int i = 0; i < 30; i++) {
            String key = String.valueOf(i);
            new Thread(()->{
                map.put(key,UUID.randomUUID().toString().substring(0,5));
                System.out.println(map);

            },String.valueOf(i).toString()).start();
        }
    }
}
