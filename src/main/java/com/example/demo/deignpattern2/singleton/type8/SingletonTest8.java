package com.example.demo.deignpattern2.singleton.type8;

public class SingletonTest8 {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode()+" "+instance2.hashCode());
    }

}

enum Singleton{

    INSTANCE;//属性

    public void sayOk(){
        System.out.println("it`s ok ~~~~");
    }
}
