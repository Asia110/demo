package com.example.demo.deignpattern.builder;

public class Client {

    public static void main(String[] args) {
        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();

        HouseBuilderDirector houseBuilderDirector= new HouseBuilderDirector(commonHouseBuilder);
        houseBuilderDirector.constructHouse();

        HighHouseBuilder highHouseBuilder = new HighHouseBuilder();
        HouseBuilderDirector houseBuilderDirector1 = new HouseBuilderDirector(highHouseBuilder);
        houseBuilderDirector1.constructHouse();
        StringBuilder sb = new StringBuilder();
    }
}
