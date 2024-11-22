package com.example.demo.deignpattern2.builder;

public abstract class HouseBuilder {

    protected House house = new House();


    public House buildHouse(){ return house;}

    public abstract void buildBaisc();

    public abstract void buildWall();

    public abstract void buildRoofed();



}
