package com.example.demo.deignpattern2.builder;

public class Client {

    public static void main(String[] args) {

        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        HighHouseBuilder highHouseBuilder = new HighHouseBuilder();

        HouseBuilderDirector houseBuilderDirector = new HouseBuilderDirector(highHouseBuilder);
        House house = houseBuilderDirector.constructHouse();
        System.out.println(house);



    }
}
