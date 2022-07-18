package com.example.demo.deignpattern.builder;

public class HouseBuilderDirector {


    HouseBuilder houseBuilder = null;


    public HouseBuilderDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.buildRoofed();
        return  houseBuilder.buildHouse();
    }

}
