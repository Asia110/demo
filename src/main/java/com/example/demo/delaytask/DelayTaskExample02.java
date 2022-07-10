package com.example.demo.delaytask;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author chenyaguo
 * @date 2021/2/5 15:32
 */
public class DelayTaskExample02 {

    public static void main(String[] args) {
        System.out.println("程序启动时间"+LocalDateTime.now());

        scheduledExecutorServiceTask();
    }

    /**
     * 实现固定频率一直循环执行任务
     */
    public static  void scheduledExecutorServiceTask(){
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        executor.scheduleWithFixedDelay(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("执行任务 de 当前时间为"+ LocalDateTime.now());
                    }
                },
                2,//初次执行间隔
                5,// 每隔delay 执行一次
                TimeUnit.SECONDS
        );
    }
}
