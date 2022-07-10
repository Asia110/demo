package com.example.demo.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author chenyaguo
 * @date 2022/1/11 18:22
 */
public class CyclicBarrierTest {

    public static void main(String[] args) {

        CyclicBarrier  cyclicBarrier = new CyclicBarrier(7,()->{
            System.out.println("召唤神龙成功！！！！");
        });

        for (int i = 0; i < 7 ; i++) {
            int temp =i;
            new Thread(()->{
                System.out.println(Thread.currentThread().getName() + "收集" + temp +"个龙珠");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }

            }).start();
        }

    }
}
