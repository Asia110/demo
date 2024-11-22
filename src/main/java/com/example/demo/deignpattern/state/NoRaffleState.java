package com.example.demo.deignpattern.state;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/28 21:04
 * @Description: 不能抽奖状态
 */
public class NoRaffleState extends State{

    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity){
        this.activity = activity;
    }

    // 当前状态可以扣积分 , 扣除后，将状态设置成可以抽奖状态
    @Override
    public void deductMoney() {
        System.out.println("扣除50 积分成功，可以抽奖了！！");
    }

    @Override
    public boolean raffle() {
        System.out.println("扣除积分后才能抽奖吆。。");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品了");
    }
}
