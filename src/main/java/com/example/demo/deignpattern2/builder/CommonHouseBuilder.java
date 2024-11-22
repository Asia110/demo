package com.example.demo.deignpattern2.builder;

public class CommonHouseBuilder extends HouseBuilder{
    @Override
    public void buildBaisc() {
        house.setBasic("CommonHouse地基 1米");
        System.out.println("CommonHouseBuilder buildBaisc");
    }

    @Override
    public void buildWall() {
        house.setWall("CommonHouse 墙2米");
        System.out.println("CommonHouseBuilder buildWall");

    }

    @Override
    public void buildRoofed() {
        house.setRoofed("CommonHouse 屋顶 3米 ");
        System.out.println("CommonHouseBuilder buildRoofed");

    }
}
