package com.example.demo.rule;

/**
 * @author chenyaguo
 * @date 2021/1/21 9:54
 */
public class RuleDemo {

    public static void main(String[] args) {

        ABRule rule = new Rule1();
        Integer integer = Rule1.map.get("1");
        rule.sout(integer);

        System.out.println("这是一个输出语句");

        for (int i = 0; i <2 ; i++) {

            if(i== 2){
                break;
            }

        }

        System.out.println("woshigeshuchu !");
        int  a =10;
        int b= 20;

        int c =add(a,b);
        System.out.println("相加结果为"+ c);

    }

    public static  int add(int x, int y){
        int z = x+y;
        return z;
    }
}
