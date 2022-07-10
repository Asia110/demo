package com.example.demo.deignpattern.singleton.type4;

/**
 * 懒汉式 线程安全，单效率太低
 */
public class SingletonTest04 {
    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }

}

class Singleton {

    private Singleton(){

    }

    private static  Singleton instance ;

    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

