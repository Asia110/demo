package com.example.demo.util;

import com.example.demo.mapstruct.Person;
import org.apache.commons.collections4.MapUtils;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * @author chenyaguo
 * @date 2022/1/7 14:25
 */
public class StringTest {


    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        Person person1= new Person();
        person1.setId(1L);
        person1.setName("小一");

        Person person2= new Person();
        person2.setId(2L);
        person2.setName("小一");

        Person person3= new Person();
        person3.setId(3L);
        person3.setName("小一");
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);


        Map<Long, Person> collect = personList.stream().collect(Collectors.toMap(Person::getId, Function.identity()));
        System.out.println(collect);

        LongStream longs = ThreadLocalRandom.current().longs();
        for(Map.Entry<Long,Person> entry : collect.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
