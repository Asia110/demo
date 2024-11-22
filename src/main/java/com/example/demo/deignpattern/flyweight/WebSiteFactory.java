package com.example.demo.deignpattern.flyweight;

import jdk.nashorn.internal.runtime.regexp.joni.constants.StringType;

import java.util.HashMap;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/7 22:47
 * @Description:
 */
public class WebSiteFactory {
    private HashMap<String,ConcreteWebSite> pool =new HashMap<>();

    public WebSite getWebSite(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    //获取网站分类的总数 池中有多少个网站类型
    public int getWebSiteCount(){
        return pool.size();
    }

}
