package com.example.demo.guava;

import com.alibaba.fastjson.JSON;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Lists;

import com.google.common.collect.Table;
import com.google.common.primitives.Ints;
import org.apache.commons.lang3.StringUtils;

import java.util.*;


/**
 * @author chenyaguo
 * @date 2022/1/5 11:31
 */
public class GuavaDemo {


    private static final CharMatcher CHAR_MATCHER=CharMatcher.any();

    public static void main(String[] args) {



        Joiner joiner = Joiner.on(",").skipNulls();
        String join = joiner.join(Lists.newArrayList("a", null, "b"));
        System.out.println(join);


        CHAR_MATCHER.retainFrom("123ghkj12y3asd-asd09");

        System.out.println(   CHAR_MATCHER.retainFrom("123ghkj12y3asd-asd09"));

        List<Integer> integers = Ints.asList(1, 2, 3, 4);


        String join1 = Ints.join(".", 1, 2, 3, 4, 5, 6);
        System.out.println(join1);
        ArrayList<String> objects = Lists.newArrayList();
        objects.add("123");

        boolean equal = Objects.equal("1", "2");

        java.util.Objects.equals("1","2");
        System.out.println("===============================");
        //=================================
        Table<String, String, Integer> hashBasedTable = HashBasedTable.create();
        hashBasedTable.put("chen","星期一",100);
        hashBasedTable.put("chen1","星期二",200);
        hashBasedTable.put("chen2","星期三",300);
        hashBasedTable.put("chen3","星期四",400);
        Set<String> strings = hashBasedTable.rowKeySet();
        Set<String> strings1 = hashBasedTable.columnKeySet();
        Collection<Integer> values = hashBasedTable.values();

        strings.stream().forEach(item->{
            System.out.println(item);
        });
        strings1.stream().forEach(item->{
            System.out.println(item);
        });

        values.stream().forEach(item->{
            System.out.println(item);
        });

        System.out.println("================================222222222");

        Integer a= 200;
        Integer b =200;
        System.out.println(a==b);
        System.out.println(a.equals(b));



        System.out.println("=========================3333");

        List<String>  listStr1 = Arrays.asList("zhangsan","lisi");
        List<String>  listStr2 = Arrays.asList("wangwu","zhaoliu");
        List<String>  listStr3 = Arrays.asList("lilaoer","guomeimei");
        Map<String,List<String>> map = new HashMap<>();

        map.put("10000",listStr1);
        map.put("10001",listStr2);
        map.put("10002",listStr3);


        System.out.println(JSON.toJSONString(map));


        System.out.println("3pl_cryXX52".toLowerCase().contains("3pl_"));


        System.out.println("===11111==================");
        String  userCode ="3pl_cryXX52";


        System.out.println(userCode != null && !userCode.toLowerCase().contains("3pl_"));

        System.out.println("=============================22222==================");
        String provinceAgencyCode = "";
        String areaCode = "100201";

        StringJoiner joiner1 = new StringJoiner("_");
        joiner1.add(provinceAgencyCode);
        if(StringUtils.isNotBlank(areaCode)){
            joiner1.add(areaCode);
        }

        System.out.println(joiner1.toString());

    }
}
