package com.example.demo.deignpattern.singleton.type1;

/**
 * 饿汉式
 */
public class SingletonTest01 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println(instance1 == instance2);
    }

}

class Singleton {

    private Singleton(){

    }
    private static final Singleton instance = new Singleton() ;


    public static Singleton getInstance(){
        return instance;
    }
}

