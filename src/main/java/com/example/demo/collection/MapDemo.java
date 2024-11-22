package com.example.demo.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<String,Integer> countMap = new HashMap<>();
        List<String> list= Arrays.asList("apple","orange","banana","orange","orange");

        for (String item :list){
            countMap.merge(item,1,Integer::sum);
        }

        countMap.forEach((key,value)->{
            System.out.println("key:"+key+" value="+value);
        });
    }
}
