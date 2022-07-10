package com.example.demo.guava;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    }
}
