package com.example.demo.deignpattern.template;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/9 11:23
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
        System.out.println("----------------------");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();
        System.out.println("----------------------");
        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();


    }
}
