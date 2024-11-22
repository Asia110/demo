package com.example.demo.future;

import java.util.concurrent.*;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/8/16 21:12
 * @Description:
 */
public class completableFutrueDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.runAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(voidCompletableFuture.get());

        System.out.println("-----------------");

        CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            return "返回值";
        }, executorService);

        System.out.println(stringCompletableFuture.get());

    }
}
