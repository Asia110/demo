package com.example.demo.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author chenyaguo
 * @date 2021/11/22 17:08
 */
public class FutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("start!!!");
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> {
            try {
                System.out.println("------------");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 1;
        });

        System.out.println(future.get());
        System.out.println("finish!!!");

    }

}




