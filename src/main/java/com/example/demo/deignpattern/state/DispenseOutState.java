package com.example.demo.deignpattern.state;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/28 21:14
 * @Description:
 */
public class DispenseOutState extends State{

    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity){
        this.activity=activity;
    }
    @Override
    public void deductMoney() {
        System.out.println("奖品发送完了，请下次再参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了，请下次再参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了，请下次再参加");
    }
}
