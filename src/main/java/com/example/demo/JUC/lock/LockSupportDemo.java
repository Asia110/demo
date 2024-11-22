package com.example.demo.JUC.lock;

import java.sql.Time;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/10/19 21:06
 * @Description:
 */
public class LockSupportDemo {


    public static void main(String[] args) {

        //demo1();
        //demo2();
        demo3();
    }

    public static void demo3(){


        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "开始执行");
            LockSupport.park();

            System.out.println(Thread.currentThread().getName() + "被唤醒");

        }, "T1");
        t1.start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            System.out.println(Thread.currentThread().getName() + "唤醒t1");
            LockSupport.unpark(t1);
        },"T2").start();

    }


    public static void demo2(){


        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();

        new Thread(()->{
            try {
                lock.lock();
                System.out.println(Thread.currentThread().getName()+"执行---");
                condition.await();
                System.out.println(Thread.currentThread().getName()+"被唤醒---");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        },"T1").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            try {
                lock.lock();
                condition.signal();
                System.out.println(Thread.currentThread().getName()+"唤醒操作---");
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        },"T2").start();


    }

    public static void demo1(){
        Object lock = new Object();

        new Thread(()->{
            synchronized (lock){
                System.out.println(Thread.currentThread().getName() +"进来了");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() +"唤醒了");

        },"T1").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{

            synchronized (lock){
                lock.notify();
                System.out.println(Thread.currentThread().getName() +"发出唤醒通知");
            }
        },"T2").start();

    }
}
