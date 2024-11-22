package com.example.demo.JUC.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/8/3 20:51
 * @Description:
 */
public class FutrueTaskDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<String> futureTask = new FutureTask<>(new MyThread());

        Thread thread = new Thread(futureTask);
        thread.start();
        String s = futureTask.get();
        System.out.println(s);


    }
}

class MyThread implements Callable{

    @Override
    public Object call() throws Exception {
        return "call----";
    }
}