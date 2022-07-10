package com.example.demo.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @author chenyaguo
 * @date 2022/1/11 17:25
 */
public class CallableTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer>  futureTask = new FutureTask<>(new MyThread());
        new Thread(futureTask,"a").start();
        System.out.println(futureTask.get());
    }


}

class MyThread implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        System.out.println("call () 方法被调用");
        return 1024;
    }
}
