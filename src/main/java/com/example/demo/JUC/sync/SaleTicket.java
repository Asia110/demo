package com.example.demo.JUC.sync;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/10 21:05
 * @Description:
 */
public class SaleTicket {

    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 40; i++) {
                    System.out.println("1111111111111111111");
                    ticket.sale();
                }
            }
        },"卖票1线程。。").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 40; i++) {
                    System.out.println("222222222222222222222222");
                    ticket.sale();
                }
            }
        },"卖票2线程。。").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 40; i++) {
                    System.out.println("333333333333333333333");
                    ticket.sale();
                }
            }
        },"卖票3线程。。").start();

    }

}

class Ticket{

     private  int number =30;
    int i =0;
     //卖票
     public   synchronized void sale(){


         if(number >0){
             System.out.println(Thread.currentThread().getName() +" 卖出票数："+(i++)+" 剩余票数："+(number--));
         }


     }
}