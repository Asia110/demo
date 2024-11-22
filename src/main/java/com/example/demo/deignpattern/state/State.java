package com.example.demo.deignpattern.state;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/28 21:01
 * @Description:
 */
public abstract class State {

    //扣除积分
    public abstract void deductMoney();

    //是否抽中奖品
    public abstract boolean raffle();
    //发放奖品
    public abstract void dispensePrize();

}
