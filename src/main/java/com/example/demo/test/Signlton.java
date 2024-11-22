package com.example.demo.test;

public class Signlton {

    private static final Signlton signlton= new Signlton();

    private Signlton(){

    }

    public static Signlton getSignton(){
        return signlton;

    }


}
