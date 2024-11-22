package com.example.demo.deignpattern2.bridge;

public abstract class Phone {

    private Brand brand;

    public Phone(Brand brand){
        this.brand = brand;
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
