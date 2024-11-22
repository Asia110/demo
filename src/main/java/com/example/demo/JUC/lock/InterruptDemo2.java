package com.example.demo.JUC.lock;

import java.util.concurrent.TimeUnit;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/10/18 21:28
 * @Description:
 */
public class InterruptDemo2 {

    public static void main(String[] args) {

        System.out.println(Thread.interrupted());
        System.out.println(Thread.interrupted());
        System.out.println("-----------1----------");
        Thread.currentThread().interrupt();
        System.out.println("-----------2----------");

        System.out.println(Thread.interrupted());
        System.out.println(Thread.interrupted());
        System.out.println(Thread.interrupted());
        System.out.println(Thread.interrupted()); System.out.println(Thread.interrupted());

    }
}
