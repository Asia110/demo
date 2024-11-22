package com.example.demo.deignpattern2.bridge;

public class FoldPhone extends Phone{
    public FoldPhone(Brand brand) {
        super(brand);
    }

    protected void open(){
        super.open();
        System.out.println("折叠手机。。。。。。。。");
    }

    protected void call(){
        super.call();
        System.out.println("折叠手机。。。。。。。");
    }

    protected void close(){
        super.close();
        System.out.println("折叠手机。。。。。。。。");
    }


}
