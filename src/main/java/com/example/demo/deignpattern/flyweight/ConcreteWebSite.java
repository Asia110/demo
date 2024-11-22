package com.example.demo.deignpattern.flyweight;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/7 22:24
 * @Description:
 */
public class ConcreteWebSite extends WebSite {

    private String  type="";//网站的类型

    public ConcreteWebSite(String type){
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站发布形式为:"+type+ "  使用者："+user.getName());
    }
}
