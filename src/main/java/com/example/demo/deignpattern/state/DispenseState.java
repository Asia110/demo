package com.example.demo.deignpattern.state;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/28 21:13
 * @Description:
 */
public class DispenseState extends State {

    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖--");
        return false;
    }

    @Override
    public void dispensePrize() {
        if(activity.getCount()>0){
            System.out.println("恭喜中奖了~~");
            // 改变状态为不能抽奖
            activity.setState(activity.getNoRaffleState());
        }else {
            System.out.println("很遗憾 奖品发放完毕~~");
            // 改变状态为奖品发送完毕, 后面我们就不可以抽奖
            activity.setState(activity.getDispenseOutState());

        }

    }
}
