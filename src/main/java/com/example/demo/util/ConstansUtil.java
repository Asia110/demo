package com.example.demo.util;

import java.time.Instant;

/**
 * @author chenyaguo
 * @date 2021/2/24 14:40
 */
public class ConstansUtil {

    static {
        System.out.println("我被加载了");
    }

    public static  void  getDateTime(){
        int a =0;
        int b=1;
        int c= a+b;
        System.out.println(Instant.now().getEpochSecond());
    }
}
