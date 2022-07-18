package com.example.demo.deignpattern.adapter.springMvc;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/7/16 9:02
 * @Description:
 */
public interface Controller {
}

class HttpController implements Controller{
    public void doHttpHandler(){
        System.out.println("http....");
    }
}

class SimpleController implements Controller{
    public void doSimplerHandler(){
        System.out.println("simple...");
    }
}
class AnnotationController implements Controller{
    public void doAnnotationHandler(){
        System.out.println("annotation...");
    }
}