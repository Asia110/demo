package com.example.demo.deignpattern2.singleton.type7;

public class SingletonTest7 {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode() + "  "+ instance2.hashCode() );
    }
}
class Singleton{

    private Singleton(){}


    private static class SingletonInstance{
        private static  Singleton INSTANCE =new Singleton();
    }

    public static synchronized Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }

}
