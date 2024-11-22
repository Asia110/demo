package com.example.demo.JUC.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/14 17:51
 * @Description:
 */
public class SaleTicket {

    public static void main(String[] args) {

        Ticket ticket = new Ticket();

        new Thread(()->{
            for (int i = 0; i < 50; i++) {
                ticket.sale();
            }
        },"aa").start();

        new Thread(()->{
            for (int i = 0; i < 50; i++) {
                ticket.sale();
            }
        },"bb").start();

        new Thread(()->{
            for (int i = 0; i < 50; i++) {
                ticket.sale();
            }
        },"cc").start();
    }
}

class Ticket {

    private int number = 30;
    int i = 0;
    //卖票
    ReentrantLock lock = new ReentrantLock(true);

    public void sale() {
        lock.lock();
        try{
            if (number > 0){
                System.out.println(Thread.currentThread().getName() +"卖出第:"+(++i) +"张票 ，还剩 "+(--number)+"张票");
            }
        }catch (Exception e){

        }finally {
            lock.unlock();
        }

    }
}
