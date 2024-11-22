package com.example.demo.deignpattern2.singleton.type5;

public class SingletonTest5 {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode() + "  "+ instance2.hashCode() );

    }
}

class Singleton{

    private Singleton(){}

    private static Singleton singleton;


    public static Singleton getInstance(){

        if(singleton == null){
            synchronized (Singleton.class){
                singleton = new Singleton();
            }
        }
        return singleton;
    }

}
