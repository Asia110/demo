package com.example.demo.thread;

import org.springframework.transaction.support.TransactionTemplate;

import java.util.concurrent.CountDownLatch;

/**
 * @author chenyaguo
 * @date 2022/1/11 18:07
 */
public class CountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(5);
        for (int i = 0; i <6 ; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName() + "====> start");
                countDownLatch.countDown();
            }).start();

        }
        countDownLatch.await();
        System.out.println(" main 线程  执行-------------------");
    }

}
