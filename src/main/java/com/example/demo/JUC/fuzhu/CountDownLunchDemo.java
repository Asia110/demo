package com.example.demo.JUC.fuzhu;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/6/8 21:14
 * @Description:
 */
public class CountDownLunchDemo {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(10);

        for (int i = 0; i < 10; i++) {

            new Thread(()->{
                System.out.println(Thread.currentThread().getName() +"离开了");
                countDownLatch.countDown();
            },"第"+i+"个同学").start();
        }
        countDownLatch.await();

        System.out.println(Thread.currentThread().getName() +"锁门下班。。。");
    }
}
