package com.example.demo.deignpattern.flyweight;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/7 23:02
 * @Description:
 */
public class Client {


    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite webSite = factory.getWebSite("新闻");
        webSite.use(new User("小红"));

        WebSite webSite1 = factory.getWebSite("新闻");
        webSite1.use(new User("刘"));

        WebSite webSite2 = factory.getWebSite("博客");
        webSite2.use(new User("老铁"));

        System.out.println("网站的类型个数:"+ factory.getWebSiteCount());
    }
}
