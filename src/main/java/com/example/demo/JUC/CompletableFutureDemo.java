package com.example.demo.JUC;

import java.util.concurrent.CompletableFuture;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/7/24 20:22
 * @Description:
 */
public class CompletableFutureDemo {

    public static void main(String[] args) {

        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(()->{
            System.out.println(Thread.currentThread().getName()+"completableFuture");
            return 1024;
        });

        completableFuture.whenComplete((s,e)->{
            System.out.println(s);
            System.out.println(e);

        });


    }
}
