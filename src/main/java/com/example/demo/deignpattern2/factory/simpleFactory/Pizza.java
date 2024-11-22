package com.example.demo.deignpattern2.factory.simpleFactory;

public abstract class Pizza {

    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void bake(){
        System.out.println(name +" baking;");
    }

    public void cut(){
        System.out.println(name +" cutting ");
    }

    public void boxing(){
        System.out.println(name + " boxing");
    }



}
