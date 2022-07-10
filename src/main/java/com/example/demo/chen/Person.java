package com.example.demo.chen;

/**
 * @author chenyaguo
 * @date 2021/1/20 18:01
 */
public abstract class Person {

    public  int a =0;

    public abstract String sayHello(String msg);

    public String  execute(int age){

        return Integer.toString(age);
    }
}
