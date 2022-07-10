package com.example.demo.exception;

/**
 * @author chenyaguo
 * @date 2021/1/30 16:48
 */
public class User {




    public String  buy(int a){
        SuperMarket superMarket = new SuperMarket();

       try {
            superMarket.haveommodity(a);
            System.out.println("我是客户 我来买东西!");
        }catch (Exception e){
            e.printStackTrace();
            //return "异常返回！";
        }
        System.out.println("客户买东西完成");
        return  "代码结束";
    }
}
