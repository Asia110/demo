package com.example.demo.deignpattern2.bridge;

public class client {

    public static void main(String[] args) {

        FoldPhone foldPhone = new FoldPhone(new Vivo());
        foldPhone.open();
        foldPhone.call();
        foldPhone.close();

        System.out.println("****************************");

        FoldPhone foldPhone1 = new FoldPhone(new XiaoMi());
        foldPhone1.open();
        foldPhone1.call();
        foldPhone1.close();
        System.out.println("******************************");

        UpRightPhone upRightPhone = new UpRightPhone(new XiaoMi());
        upRightPhone.open();
        upRightPhone.call();
        upRightPhone.close();

    }

}
