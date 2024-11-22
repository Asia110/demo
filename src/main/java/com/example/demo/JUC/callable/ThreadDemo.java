package com.example.demo.JUC.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/6/8 20:22
 * @Description:
 */
public class ThreadDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        new Thread( new MyThreadDemo(),"线程1").start();

        FutureTask<Integer> futureTask = new FutureTask<>(new MyCallableDemo());

        new Thread(futureTask,"线程二").start();
        Integer integer = futureTask.get();
        System.out.println(integer);

        FutureTask<Integer> futureTask1 = new FutureTask<>(()->{
            return 1023;
        });
        new Thread(futureTask1,"线程3").start();

        Integer integer1 = futureTask1.get();

        System.out.println(integer+integer1);
    }


}


class MyThreadDemo implements Runnable
{

    @Override
    public void run() {
        System.out.println("Thread run....");
    }
}

class  MyCallableDemo implements Callable
{

    @Override
    public Integer call() throws Exception {
        System.out.println("Callable call");

        return 2;
    }
}