package com.example.demo.deignpattern2.flyweight;

public class client {

    public static void main(String[] args) {

        WebSiteFactory factory = new WebSiteFactory();

        WebSite webSite = factory.getWebSite("新闻");
        webSite.use(new User("小张"));

        WebSite webSite1 = factory.getWebSite("新闻");

        webSite1.use(new User("小红"));

        WebSite webSite2 = factory.getWebSite("博客");
        webSite2.use(new User("老铁"));
        System.out.println("网站的类型个数:"+ factory.getWebSiteCount());


    }
}
