package com.example.demo.JUC.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/2/26 12:25
 * @Description:
 */

class Share {

    private int number = 0;

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    //如果是0 就加一
    public void incre() throws InterruptedException {
        try{
            lock.lock();
            while (number != 0) {
                condition.await();
            }
            number++;
            System.out.println("当前线程为：" + Thread.currentThread().getName() + " number:" + number);
            condition.signalAll();
        }finally {
            lock.unlock();
        }

    }

    //如果是1 就减一
    public void decre() throws InterruptedException {
        try{
            lock.lock();
            while (number != 1) {
                condition.await();
            }
            number--;
            System.out.println("当前线程为：" + Thread.currentThread().getName() + " number:" + number);
            condition.signalAll();
        }finally {
            lock.unlock();
        }

    }

}

public class ThreadDemo2 {

    public static void main(String[] args) {
       Share share = new Share();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        share.incre();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        },"AA").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        share.decre();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"BB").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        share.incre();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        },"CC").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        share.decre();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"DD").start();
    }


}

