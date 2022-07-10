package com.example.demo.designparttern.liskov;

/**
 * @author chenyaguo
 * @date 2021/3/10 15:50
 */
public class Liskov {

    public static void main(String[] args) {

        A a = new A();

        System.out.println(a.func1(10,5));
        System.out.println("=================");

        B b = new B();
        System.out.println(b.func1(1,2));
        System.out.println(b.func2(1,2));
        System.out.println(b.func3(10,5));

    }

}
