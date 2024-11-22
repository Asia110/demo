package com.example.demo.JUC.other;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/5/22 21:37
 * @Description:
 */
public class SynchDemo {

    public static void main(String[] args) {

        Object o = new Object();
        new Thread(()->{
            synchronized (o){
                System.out.println(Thread.currentThread().getName()+"外层");
              synchronized (o){
                  System.out.println(Thread.currentThread().getName()+"中层");
                  synchronized (o){
                      System.out.println(Thread.currentThread().getName()+"内层");
                  }
              }
            }

        },"aa").start();

    }
}
