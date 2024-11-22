package com.example.demo.deignpattern2.builder;

public class HighHouseBuilder extends HouseBuilder{
    @Override
    public void buildBaisc() {
        house.setBasic("HighHouse 地基 10米");
        System.out.println("HighHouseBuilder buildBaisc");
    }

    @Override
    public void buildWall() {
        house.setWall("HighHouse 墙20米");
        System.out.println("HighHouseBuilder buildWall");
    }

    @Override
    public void buildRoofed() {
        house.setRoofed("HighHouse 屋顶 30米 ");
        System.out.println("HighHouseBuilder buildRoofed");

    }
}
