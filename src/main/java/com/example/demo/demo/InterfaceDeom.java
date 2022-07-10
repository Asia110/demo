package com.example.demo.demo;

import java.util.Objects;

/**
 * @author chenyaguo
 * @date 2021/2/19 20:31
 */
public class InterfaceDeom {

    public static void main(String[] args) {
        Animals dog = new Dog();
        String eat = dog.eat();
        System.out.println(eat);

        Animals cat = new Cat();
        System.out.println(cat.eat());

        Objects.equals(1, 1);

        float a = 1.0f - 09f;
        float b = 0.9f - 0.8f;
        float diff = 1e-6f;

        if (Math.abs(a - b) < diff) {
            System.out.println(true);
        }

    }
}
