package com.example.demo.deignpattern2.builder;

public class HouseBuilderDirector {

    HouseBuilder houseBuilder = null;

    public HouseBuilderDirector(HouseBuilder houseBuilder){
        this.houseBuilder =houseBuilder;
    }

    public House constructHouse(){
        houseBuilder.buildBaisc();
        houseBuilder.buildWall();
        houseBuilder.buildRoofed();
        return houseBuilder.house;
    }
}
