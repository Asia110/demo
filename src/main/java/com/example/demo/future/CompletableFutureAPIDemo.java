package com.example.demo.future;

import java.util.concurrent.*;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/9/13 21:37
 * @Description:
 */
public class CompletableFutureAPIDemo {


    public static void main(String[] args) {

        demo5();


    }

    public static  void demo5(){

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {

            return 2;
        });


        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {

            return 2;
        });

        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {

            return 2;
        });
//        CompletableFuture<Integer> future2 = future.thenCombine(future, (x, y) -> {
//            return x + y;
//        });
//
//        System.out.println(future2.join());

        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(future, future1, future);
        try {
            System.out.println(voidCompletableFuture.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }


    public static void demo4(){

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "AAA";
        });


        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "BBB";
        });

        CompletableFuture<String> resultfuture = future1.applyToEither(future2, (f) -> {
            return f + " winer";
        });


        System.out.println(resultfuture.join());


    }

    public static void demo3() {

        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.supplyAsync(() -> {

            return 1;
        }).thenApply((f) -> {
            return f + 2;
        }).thenApply((f) -> {
            return f + 2;
        }).thenAccept((r) -> {
            System.out.println(r);
        });

    }

    public static void demo2() {

        ExecutorService threadPool = Executors.newFixedThreadPool(2);

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("111");
            return "111";
        }, threadPool).thenApply(f -> {
            int e = 10 / 0;
            System.out.println("222");
            return f + "222";
        }).thenApply(f -> {
            System.out.println("333");
            return f + "333";
        }).whenComplete((r, e) -> {
            if (e == null) {
                System.out.println("计算结果：" + r);
            }
        }).exceptionally(e -> {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return null;
        });


        System.out.println(Thread.currentThread().getName() + "先执行。。。。");

        threadPool.shutdown();


    }


    public static void demo1() {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "123";
        });

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println(future.getNow("sss"));

        System.out.println(future.complete("completeValue") + "  " + future.join());
    }
}
