package com.example.demo.JUC.sync;

import lombok.Synchronized;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/2/25 21:29
 * @Description:
 */

class Share{

    private int number =0;

    //如果是0 就加一
    public  synchronized void incre() throws InterruptedException {
        while (number != 0){
            this.wait();
        }
        number++;
        System.out.println("当前线程为："+Thread.currentThread().getName() +" number:"+number);
        this.notifyAll();
    }

    //如果是1 就减一
    public synchronized void decre() throws InterruptedException {
        while(number != 1){
            this.wait();
        }
        number --;
        System.out.println("当前线程为："+Thread.currentThread().getName() +" number:"+number);
        this.notifyAll();
    }

}
public class TheadDemo {

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



