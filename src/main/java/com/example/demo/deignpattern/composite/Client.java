package com.example.demo.deignpattern.composite;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/7/31 0:28
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        OrganizationComponent university=new University("北大","顶尖学校");

        OrganizationComponent college1 = new College("计算机系","牛逼的系");
        OrganizationComponent college2 = new College("传媒系","牛逼的系");

        OrganizationComponent department1 = new Department("软件工程","牛逼的软件工程");
        OrganizationComponent department2 = new Department("网络完全","牛逼的网络完全");

        OrganizationComponent department3 = new Department("记者员","牛逼的记者员");
        OrganizationComponent department4 = new Department("播音员","牛逼的播音员");

        college1.add(department1);
        college1.add(department2);


        college2.add(department3);
        college2.add(department4);

        university.add(college1);
        university.add(college2);

        college2.print();







    }
}
