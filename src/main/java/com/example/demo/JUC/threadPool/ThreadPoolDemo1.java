package com.example.demo.JUC.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/6/26 21:18
 * @Description:
 */
public class ThreadPoolDemo1 {

    public static void main(String[] args) {
        //ExecutorService executorService = Executors.newFixedThreadPool(5);

        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newCachedThreadPool();

        try {
            for (int i = 1; i <= 30; i++) {

                int finalI = i;
                executorService.execute(()->{
                    System.out.println("当前线程"+Thread.currentThread().getName()+"正在处理第"+ finalI +"个任务");
                });

                Thread.sleep(1);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }

    }
}
