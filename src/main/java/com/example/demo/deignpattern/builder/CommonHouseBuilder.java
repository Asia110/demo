package com.example.demo.deignpattern.builder;

public class CommonHouseBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("CommonHouse buildBasic");
    }

    @Override
    public void buildWall() {
        System.out.println("CommonHouse buildWall");
    }

    @Override
    public void buildRoofed() {
        System.out.println("CommonHouse buildRoofed");
    }
}
