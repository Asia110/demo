package com.example.demo.deignpattern.builder;

/**
 * 抽象构建者
 */
public abstract class HouseBuilder {

    protected House house = new House();

    public abstract void buildBasic();

    public abstract void buildWall();

    public abstract void buildRoofed();

    public House buildHouse(){
        return house;
    }
}
