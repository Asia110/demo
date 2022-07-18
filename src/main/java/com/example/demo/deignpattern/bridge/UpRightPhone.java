package com.example.demo.deignpattern.bridge;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/7/17 19:28
 * @Description:
 */
public class UpRightPhone extends Phone{

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    protected void open(){
        super.open();
        System.out.println("直立手机。。");
    }

    protected void call(){
        super.call();
        System.out.println("直立手机。。");
    }

    protected void close(){
        super.close();
        System.out.println("直立手机。。");
    }
}
