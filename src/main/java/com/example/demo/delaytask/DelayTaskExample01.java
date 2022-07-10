package com.example.demo.delaytask;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author chenyaguo
 * @date 2021/2/5 14:09
 */
public class DelayTaskExample01 {

    private static Map<String,Long> _TaskMap = new HashMap<>();

    public static void main(String[] args) {

        System.out.println("程序启动时间： "+LocalDateTime.now());
        _TaskMap.put("task-1",Instant.now().plusSeconds(5).toEpochMilli());
        loopTask();
    }


    public static  void loopTask(){

        Long itemLong =0L;
        while (true){
            Iterator it = _TaskMap.entrySet().iterator();
            while (it.hasNext()){
                Map.Entry entry =(Map.Entry) it.next();
                itemLong =(Long)entry.getValue();
                //有任务需要执行
                if(Instant.now().toEpochMilli() >= itemLong){
                    //延迟任务，业务逻辑执行
                    System.out.println("执行任务："+entry.getKey()+", 执行时间："+ LocalDateTime.now());
                    _TaskMap.remove(entry.getKey());
                }
            }
        }

    }
}
