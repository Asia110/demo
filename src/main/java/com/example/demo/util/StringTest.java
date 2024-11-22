package com.example.demo.util;

import com.alibaba.fastjson.JSON;
import com.example.demo.mapstruct.Person;
import org.apache.commons.collections4.MapUtils;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * @author chenyaguo
 * @date 2022/1/7 14:25
 */
public class StringTest {
    private static final Integer STR_LENGTH = 4;

    public static void main(String[] args) {

//        List<Person> personList = new ArrayList<>();
//
//        Person person1= new Person();
//        person1.setId(1L);
//        person1.setName("小一");
//
//        Person person2= new Person();
//        person2.setId(2L);
//        person2.setName("小一");
//
//        Person person3= new Person();
//        person3.setId(3L);
//        person3.setName("小一");
//        personList.add(person1);
//        personList.add(person2);
//        personList.add(person3);
//
//
//        Map<Long, Person> collect = personList.stream().collect(Collectors.toMap(Person::getId, Function.identity()));
//        System.out.println(collect);
//
//        LongStream longs = ThreadLocalRandom.current().longs();
//        for(Map.Entry<Long,Person> entry : collect.entrySet()){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }


//        BigDecimal realLoadRate = new BigDecimal("0.000000" );
//
//        //限制装载率
//        BigDecimal limitLoadRate = new BigDecimal("11");
//        //比较装载率大小 如果实际装载率小于限制装载率 则进行提示
//        if(realLoadRate.compareTo(limitLoadRate) == -1){
//            System.out.println(true);
//        }
//        System.out.println(realLoadRate.compareTo(limitLoadRate) == -1);
//
//        List<String> list = Arrays.asList("JDV011803468291");
//        System.out.println(JSON.toJSONString(list));

        String str ="4550";

        System.out.println(str.length()>=STR_LENGTH);
        System.out.println(str.substring(0,str.length()-2));

        System.out.println(499/200);


    }
}
