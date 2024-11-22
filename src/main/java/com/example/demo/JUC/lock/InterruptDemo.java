package com.example.demo.JUC.lock;

import java.util.concurrent.TimeUnit;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/10/18 21:28
 * @Description:
 */
public class InterruptDemo {

    public static void main(String[] args) {

       Thread t1 =new Thread(()->{

            for (int a= 0; a<=300;a++){

                System.out.println(Thread.currentThread().getName()+":"+a);
            }
           System.out.println(Thread.currentThread().getName()+"调用interrupt之后 标识2： "+Thread.currentThread().isInterrupted());
        },"T1");
       t1.start();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.interrupt();
        System.out.println(Thread.currentThread().getName()+" 调用interrupt之后标识1"+t1.isInterrupted());

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" 调用interrupt之后标识3"+t1.isInterrupted());
    }
}
