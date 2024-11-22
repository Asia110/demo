package com.example.demo.demo;

import java.util.Objects;

/**
 * @author chenyaguo
 * @date 2021/2/19 20:31
 */
public class InterfaceDeom {

    public static void main(String[] args) {
        Animals dog = new Dog();
        dog.equals(new Object());
        String eat = dog.eat();
        System.out.println(eat);

        Animals cat = new Cat();
        System.out.println(cat.eat());


    }
}
