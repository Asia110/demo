package com.example.demo.deignpattern.bridge;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/7/17 19:08
 * @Description:
 */
public abstract class Phone {

    private Brand brand;

    public Phone(Brand brand){
        this.brand=brand;
    }

    protected void open(){
        brand.open();
    }

    protected void call(){
        brand.call();
    }

    protected void close(){
        brand.close();
    }

}
