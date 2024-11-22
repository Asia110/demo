package com.example.demo.JUC.fuzhu;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/6/8 21:27
 * @Description:
 */
public class CyclicBarrierDemo {

    public static void main(String[] args) {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(7,new Thread(()->{
            System.out.println("召唤神龙");
        }));

        for (int i = 1; i <= 7; i++) {
            new Thread(()->{
                System.out.println("收集到第"+Thread.currentThread().getName()+"颗龙珠");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            },i+"").start();
        }

    }
}
