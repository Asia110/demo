package com.example.demo.rule;

/**
 * @author chenyaguo
 * @date 2021/1/21 9:53
 */
public class Rule2 implements Rule {
    @Override
    public int getRuleType(int i) {
        if (2==i){
            return 2;
        }
        return 0;
    }

    static {
        System.out.println("我是 rule 2  我被加载");
    }
}
