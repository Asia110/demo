package com.example.demo.deignpattern2.template;

public abstract class SoyaMilk {

    final void make(){

        select();
        if(isNeedAddCondiments()){
            addCondiments();
        }
        soak();
        beat();


    }

    //选材料
    void select(){
        System.out.println("第一步 选择好新鲜的黄豆！！！");
    }

    //添加不同的配料 ，抽象方法，子类具体实现
    abstract void addCondiments();

    void soak(){
        System.out.println("第三步 黄豆和配料开始浸泡，需要三个小时的时间！！！");
    }

    void beat(){
        System.out.println("第四步： 黄豆和配料放到豆浆机打碎熬制！！！！");
    }

    boolean isNeedAddCondiments(){
        return true;
    }
}
