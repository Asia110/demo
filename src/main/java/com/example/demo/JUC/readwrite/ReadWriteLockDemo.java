package com.example.demo.JUC.readwrite;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/6/14 21:41
 * @Description:
 */
public class ReadWriteLockDemo {

    public static void main(String[] args) {
        myCache cache = new myCache();

        for (int i = 0; i <5 ; i++) {
            final  int num = i;
            new Thread(()->{
                cache.put(num+"",num+"");
            },""+i).start();
        }

        for (int i = 0; i <5 ; i++) {
            final  int num = i;
            new Thread(()->{
                cache.get(num+"");
            },""+i).start();
        }


    }

}


class myCache{

    private volatile Map<String,Object> map = new HashMap<>();

    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public void put(String key,Object value){
        readWriteLock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+"正在写"+key);
            Thread.sleep(500);
            map.put(key, value);

            System.out.println(Thread.currentThread().getName()+"写完了"+key);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            readWriteLock.writeLock().unlock();
        }

    }

    public Object get(String key){
        readWriteLock.readLock().lock();
        Object o = null;
        try {
            System.out.println(Thread.currentThread().getName()+"正在读"+key);
            Thread.sleep(500);
            o = map.get(key);
            System.out.println(Thread.currentThread().getName()+"读完了"+key);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            readWriteLock.readLock().unlock();
        }

        return o;
    }
}