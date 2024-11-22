package com.example.demo.JUC.other;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/5/22 21:46
 * @Description:
 */
public class LockDemo {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();


        new Thread(()->{
            try{
                lock.lock();
                System.out.println(Thread.currentThread().getName()+"外层");
                try{
                    lock.lock();
                    System.out.println(Thread.currentThread().getName()+"内层");
                }finally {
                    lock.unlock();
                }
            }finally {
                lock.unlock();
            }
        },"aaa").start();
    }
}
