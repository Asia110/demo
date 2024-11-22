package com.example.demo.deignpattern.strategy;

import com.google.common.collect.Lists;

import java.util.*;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/9/12 20:34
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

//        WildDuck wildDuck = new WildDuck();
//        wildDuck.setFlyBehavior(new NoFlyBehavior());
//
//        wildDuck.fly();
//
//        TonyDuck tonyDuck = new TonyDuck();
//        tonyDuck.setFlyBehavior( new BadFlyBehavior());
//        tonyDuck.fly();

         final Byte REASON_LEVEL_CODE_ONE = 1;
        boolean equals = Objects.equals(1, REASON_LEVEL_CODE_ONE);
        System.out.println(equals);

        //System.out.println(test());
    }

    public static Date add(final Date date, Integer field, Integer amount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        calendar.add(field, amount);

        return calendar.getTime();
    }


    public static String test(){
        Integer goodNumber =2;
        if(!Objects.equals(goodNumber,1)){
            return "一单多件禁止上报!";
        }
        return "zc";
    }


}
