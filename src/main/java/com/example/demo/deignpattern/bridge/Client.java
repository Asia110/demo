package com.example.demo.deignpattern.bridge;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/7/17 19:18
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        Phone phone = new FoldPhone(new Vivo());
        phone.open();
        phone.call();
        phone.close();
        System.out.println("--------------");

        Phone phone1 = new FoldPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println("--------------");

        Phone phone2 = new UpRightPhone(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();

    }
}
