package com.example.demo.thread;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.LongAdder;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/11/7 12:17
 * @Description:
 */
public class MultiThreadDebugDemo {

    public static final LongAdder LONG_ADDER = new LongAdder();
    public static void main(String[] args) {

        Thread thread1= new Thread(()->{
            while (true){
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread-1 "+ LocalDateTime.now());
                LONG_ADDER.increment();
            }
        },"thread-1");

        Thread thread2= new Thread(()->{
            while (true){
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread-2 "+ LocalDateTime.now());
                LONG_ADDER.increment();
            }
        },"thread-1");

        thread1.start();
        thread2.start();
    }
}
