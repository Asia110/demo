package com.example.demo.deignpattern2.factory.abstractFactory.pizza;

public abstract class Pizza {

    protected String name;

    //准备原材料，不同的披萨不一样，做成抽象方法
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting");
    }

    public void box() {
        System.out.println(name + " boxing");

    }

    public void setName(String name) {
        this.name = name;
    }
}
