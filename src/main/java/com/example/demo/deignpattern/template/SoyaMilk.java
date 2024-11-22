package com.example.demo.deignpattern.template;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/9 11:24
 * @Description:
 */
public abstract class SoyaMilk {

    final void make(){
        select();
        if(isNeedAddCondiments()){
            addCondiments();
        }
        soak();
        beat();

    }

    void select(){
        System.out.println("第一步：选择新鲜的豆浆。。");
    }

    //添加不同的配料，抽象方法，让子类具体实现
    abstract void addCondiments();

    void soak(){
        System.out.println("第三步： 黄豆和配料开始浸泡，需要3小时");
    }

    void beat(){
        System.out.println("第四步： 开始打磨。。");
    }

    boolean isNeedAddCondiments(){
        return true;
    }

}
