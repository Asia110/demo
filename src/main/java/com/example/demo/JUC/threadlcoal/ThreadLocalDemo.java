package com.example.demo.JUC.threadlcoal;





import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/11/26 20:30
 * @Description:
 */
public class ThreadLocalDemo {

    public static void main(String[] args) {

        House house = new House();
        for (int i = 1; i < 5; i++) {
            new Thread(()->{
                int a = new Random().nextInt(5) + 1;
                for (int j = 0; j < a; j++) {
                    house.saleWithThreadLocal();

                }
                System.out.println(Thread.currentThread().getName()+"卖出"+house.saleNum.get());
            },"销售"+i).start();
        }

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("一共买了"+house.saleNum);
    }
}
class House{
    ThreadLocal<Integer> saleNum = ThreadLocal.withInitial(()->0);
    public  void saleWithThreadLocal(){
        saleNum.set(saleNum.get()+1);
    }
}