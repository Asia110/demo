package com.example.demo.designparttern.liskov;

/**
 * @author chenyaguo
 * @date 2021/3/10 15:45
 */
public class B extends Base {

    private A a = new A();

    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b){
        return func1(a,b)+10;
    }

    public int func3(int a ,int b){
        return this.a.func1(a,b);
    }
}
