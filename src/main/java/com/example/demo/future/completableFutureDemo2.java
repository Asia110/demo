package com.example.demo.future;

import java.util.concurrent.*;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/8/29 21:15
 * @Description:
 */
public class completableFutureDemo2 {

    public static void main(String[] args) {
        future2();

    }
    public static void  future2(){

        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        CompletableFuture.supplyAsync(()->{
            System.out.println(Thread.currentThread().getName()+" future2--正在执行----");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int i = ThreadLocalRandom.current().nextInt(10);
            if(i>2){
                int i1 = 10 / 0;
            }
            return i;
        },threadPool).whenComplete((r,e)->{
            if(e == null){
                System.out.println("计算完成---"+r);
            }


        }).exceptionally(e->{
            e.printStackTrace();
            System.out.println("计算出现异常"+e.getCause()+"\t"+e.getMessage());
            return null;
        });

        System.out.println(Thread.currentThread().getName()+"线程先去忙其他任务一---");

    }



    public static void  future1() throws ExecutionException, InterruptedException {

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("进入异步线程------");
            return 110;
        });

        Integer integer = future.get();

        System.out.println(integer);

    }

}
