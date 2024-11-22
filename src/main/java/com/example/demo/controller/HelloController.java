package com.example.demo.controller;

import com.example.demo.controller.Service.ABS;
import com.example.demo.controller.Service.Sub1ServiceImpl;
import com.example.demo.controller.Service.Sub2ServiceImpl;
import com.example.demo.thread.MyThreadPoolExecutor;
import net.bytebuddy.asm.Advice;
import org.redisson.api.RCountDownLatch;
import org.redisson.api.RLock;
import org.redisson.api.RReadWriteLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Source;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author chenyaguo
 * @date 2021/12/12 16:24
 */
@RestController
public class HelloController {

    @Autowired(required = false)
    private RedissonClient redissonClient;

    @Autowired
    private ThreadPoolExecutor threadPoolExecutor;

    @GetMapping("lock")
    public String getHello() {

        RLock lock = redissonClient.getLock("lock");
        lock.lock();

        try {
            System.out.println("执行业务逻辑 加锁成功---：：" + Thread.currentThread().getId());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("释放锁---：：" + Thread.currentThread().getId());
            lock.unlock();
        }

        return "hello";
    }

    @GetMapping("read")
    @Async
    public String getRLock() {

        RReadWriteLock readWriteLock = redissonClient.getReadWriteLock("testlock");

        RLock rLock = readWriteLock.readLock();
        rLock.lock();
//        try {
//            System.out.println("读锁------"+Thread.currentThread().getName());
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        rLock.unlock();
        return "read";
    }

    @GetMapping("write")
    public String getWLock() {

        RReadWriteLock readWriteLock = redissonClient.getReadWriteLock("testlock");
        RLock rLock = readWriteLock.writeLock();
        rLock.lock();

        try {
            System.out.println("写------" + Thread.currentThread().getName());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rLock.unlock();
        return "write";
    }

    @RequestMapping("/closeDoor")
    public String closeDoor() throws InterruptedException {

        RCountDownLatch door = redissonClient.getCountDownLatch("door");
        door.trySetCount(5);
        door.await();

        return "人散了  关门了---";
    }


    @RequestMapping("go/{perpson}")
    public String gogogo(@PathVariable(name = "perpson") Integer perpson) {
        RCountDownLatch door = redissonClient.getCountDownLatch("door");

        door.countDown();
        return "第几个人走了" + perpson;
    }

    @GetMapping("/getValue")
    public String getValue() throws ExecutionException, InterruptedException {


        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            return "haha";
        },threadPoolExecutor);
        String s = future.get();
        return s;

    }

    @Autowired
    Sub1ServiceImpl sub1Service;

    @Autowired
    Sub2ServiceImpl sub2Service;

    @Autowired
    private ABS abs;

    @GetMapping("/sayhello")
    public String sayHello(){
        /*sub1Service.sayHello();
        sub2Service.sayHello();*/
        abs.ABSTest();
        return "hello";

    }



}
