package com.example.demo.deignpattern.adapter.springMvc;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/7/16 9:27
 * @Description:
 */
public interface HandlerAdapter {
    public boolean supports(Object handler);

    public void handle(Object handler);
}


class SimpleHandlerAdapter implements  HandlerAdapter{

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

    @Override
    public void handle(Object handler) {
        ((SimpleController) handler).doSimplerHandler();
    }
}

class HttpHandlerAdapter implements HandlerAdapter{

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

    @Override
    public void handle(Object handler) {
        ((HttpController) handler).doHttpHandler();
    }
}

class AnnotationHandlerAdapter implements HandlerAdapter{

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof AnnotationController);
    }

    @Override
    public void handle(Object handler) {
        ((AnnotationController) handler).doAnnotationHandler();
    }
}
