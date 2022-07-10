package com.example.demo.chen;

/**
 * @author chenyaguo
 * @date 2021/1/20 18:05
 */
public class Test {

    public static void main(String[] args) {
        OldMan oldMan = new OldMan();


        System.out.println(oldMan.sayHello("123123"));
        //exceptionDemo();
    }



    public static  void exceptionDemo(){

        try {
            int a = 10/0;
        }catch (Exception e){
            throw new RuntimeException("除数不能为零");
        }

    }
}
