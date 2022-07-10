package com.example.demo.defaultmethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 接口默认方法
 *
 * @author chenyaguo
 * @date 2021/3/3 9:25
 */
public class DefaultMethod {

    public static void main(String[] args) {
         ClassA classA = new ClassA();
         classA.foo();


        List<ClassA> list= new ArrayList<>();
        list.stream()
                .forEach(a -> System.out.println());

        String name ="";
        List<String> list1 = Arrays.asList("111", "222", "String Bludier");

        List<String> collect = list1.stream()
                .filter(x -> x.length() > 4)
                .collect(Collectors.toList());

        collect.stream()
                .forEach(System.out::print);

        System.out.println("============");
        list1.stream()
                .forEach(System.out::println);

        String str = "！";


    }
}
