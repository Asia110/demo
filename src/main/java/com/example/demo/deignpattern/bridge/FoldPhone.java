package com.example.demo.deignpattern.bridge;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/7/17 19:13
 * @Description:
 */
public class FoldPhone extends Phone{

    public FoldPhone(Brand brand) {
        super(brand);
    }

    protected void open(){
        super.open();
        System.out.println("折叠手机。。");
    }

    protected void call(){
        super.call();
        System.out.println("折叠手机。。");
    }

    protected void close(){
        super.close();
        System.out.println("折叠手机。。");
    }
}
