package com.example.demo.deignpattern.builder;

public class HighHouseBuilder extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println(" HighBuilder buildBasic");
    }

    @Override
    public void buildWall() {
        System.out.println(" HighBuilder buildWall");
    }

    @Override
    public void buildRoofed() {
        System.out.println(" HighBuilder buildRoofed");
    }
}
