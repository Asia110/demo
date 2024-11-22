package com.example.demo.deignpattern2.singleton.type6;

public class SingletonTest6 {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode() + "  "+ instance2.hashCode() );

    }
}

class Singleton {

    private Singleton() {
    }
    private static volatile Singleton singleton;
    public static Singleton getInstance() {
        if (singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
