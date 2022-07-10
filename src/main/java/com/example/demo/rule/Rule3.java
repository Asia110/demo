package com.example.demo.rule;

/**
 * @author chenyaguo
 * @date 2021/1/21 9:53
 */
public class Rule3 implements Rule {
    @Override
    public int getRuleType(int i) {
        if (3==i){
            return 3;
        }
        return 0;
    }
}
