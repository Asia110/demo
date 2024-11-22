package com.example.demo.JUC.blockQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2023/6/26 20:58
 * @Description:
 */
public class BlockQueueDemo {

    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
        blockingQueue.add("a");
        blockingQueue.add("b");
        blockingQueue.add("c");
        blockingQueue.add("c");
        System.out.println(blockingQueue.size());






    }
}
