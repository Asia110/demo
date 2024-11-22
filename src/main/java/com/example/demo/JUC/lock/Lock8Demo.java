package com.example.demo.JUC.lock;

import java.util.concurrent.TimeUnit;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/10/8 20:20
 * @Description:
 */
public class Lock8Demo {

    public static void main(String[] args) {
        Phone phone = new Phone();

        new Thread(()->{
            phone.sendEmail();
        },"a").start();

        try {TimeUnit.MILLISECONDS.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}


        new Thread(()->{
            phone.sendSMS();
        },"b").start();


    }
}

class  Phone{

    public synchronized void sendEmail(){

        try {TimeUnit.SECONDS.sleep(3);} catch (InterruptedException e) {e.printStackTrace();}
        System.out.println("----sendEmail-");
    }

    public synchronized void sendSMS(){
        System.out.println("----sendSMS-");
    }

    public void sayHello(){
        System.out.println("------hello--");
    }

}
