package com.example.demo.jvm;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/11/27 8:29
 * @Description:
 */
public class JPSTest {

    public static void main(String[] args) {
//        Scanner scanner =new Scanner(System.in);
//        String info = scanner.next();

        Long a= 76894827016559417l;
        Long b =76894827016559416l;
        System.out.println(!gt(a,b));

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        for (int i = 1; i <= integers.size(); i++) {
            System.out.println(integers.get(i));
        }

    }



    public static boolean gt(Long a,Long b) {
        if (a != null && b != null) {
            return a.longValue() > b.longValue();
        }
        return false;
    }
}
