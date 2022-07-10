package com.example.demo.rule;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenyaguo
 * @date 2021/1/21 9:51
 */
public class Rule1 extends ABRule implements Rule {

    public static Map<String,Integer> map = new HashMap();

    static {
        map.put("1",1);
        map.put("2",2);
        System.out.println("我是 rule 1  我被加载");
    }

    @Override
    public int getRuleType(int i) {
        if (1==i){
            return 1;
        }
       return 0;
    }
}
