package com.example.demo.JUC.lock;

import java.util.concurrent.TimeUnit;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/10/18 20:47
 * @Description:
 */
public class deadLockDemo {


    public static void main(String[] args) {


        final Object o1= new Object();
        final Object o2= new Object();

        new Thread(()->{

            synchronized (o1){
                System.out.println(Thread.currentThread().getName()+ "持有锁A，希望得到锁B");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName()+ "得到锁B");

                }
            }

        },"T1").start();


        new Thread(()->{

            synchronized (o2){
                System.out.println(Thread.currentThread().getName()+ "持有锁B，希望得到锁A");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1){
                    System.out.println(Thread.currentThread().getName()+ "得到锁A");

                }
            }

        },"T2").start();


    }


}
