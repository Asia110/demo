package com.example.demo.JUC.Atomic;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/11/16 20:42
 * @Description:
 */
public class Atomicdemo {


    public static void main(String[] args) {


        try {
            valiteDemo();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static AtomicInteger atomicInteger = new AtomicInteger(1);
    public static volatile int a= 1;

    public static void valiteDemo() throws InterruptedException {

        int size =100;

        CountDownLatch countDownLatch = new CountDownLatch(size);



        for (int i = 0; i < size ; i++) {

            new Thread(()->{

                try{
                    atomicInteger.getAndIncrement();
                }finally {
                    countDownLatch.countDown();
                }
            },i+"").start();
        }

        countDownLatch.await();

        System.out.println("atomicInteger ==="+atomicInteger.get());

    }
}
