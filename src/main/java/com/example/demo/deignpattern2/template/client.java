package com.example.demo.deignpattern2.template;

public class client {

    public static void main(String[] args) {


        SoyaMilk peanutSoyaMike = new PeanutSoyaMike();
        peanutSoyaMike.make();

        System.out.println("---------------------");
        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();

    }
}
