package com.example.demo.chen;

import com.alibaba.fastjson.JSON;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author chenyaguo
 * @date 2021/1/20 18:05
 */
public class Test extends ClassLoader{

    public static void main(String[] args) {



        System.out.println(isIdCardNo("36031219950330102x"));

        Integer siteid =-11;


        System.out.println(siteid>0);


        Map<Object,Object> map = new HashMap<>();
        map.put(null,null);

        ConcurrentHashMap<Object,Object> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(null,null);



    }
    /**
     * 身份证正则
     */
    public static final String ID_CARD_NO_REGEX = "(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)";


    /**
     * 判断是否是身份证号
     * @param userCode
     * @return
     */
    public static boolean isIdCardNo(String userCode) {
        if(userCode == null) {
            return false;
        }
        return userCode.matches(ID_CARD_NO_REGEX);
    }

    public static  void exceptionDemo(boolean a){

       a =true;

    }

    public static String mockThrowException(){
        try {
            System.out.println("123123");
        }catch (Exception e){
            System.out.println("exception ");
        }
        return "ok";
    }

}
