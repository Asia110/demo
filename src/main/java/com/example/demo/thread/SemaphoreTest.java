package com.example.demo.thread;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author chenyaguo
 * @date 2022/1/11 18:35
 */
public class SemaphoreTest {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);

        for (int i = 0; i <6 ; i++) {
            int temp =i;
            new Thread(()->{
                try {
                    semaphore.acquire();
                    System.out.println(temp+"号 车 获得车位");
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                    System.out.println(temp+"号 车 离开车位");
                }
            }).start();
        }
    }
}
