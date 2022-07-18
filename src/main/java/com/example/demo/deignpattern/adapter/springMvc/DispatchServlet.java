package com.example.demo.deignpattern.adapter.springMvc;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/7/16 10:55
 * @Description:
 */
public class DispatchServlet {

    public static List<HandlerAdapter> handlerAdapters = new ArrayList<>();

    public DispatchServlet(){
        handlerAdapters.add(new SimpleHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new AnnotationHandlerAdapter());
    }

    public HandlerAdapter getAdapter(Controller controller){
        for (HandlerAdapter adapter:this.handlerAdapters){
            if(adapter.supports(controller)){
                return adapter;
            }
        }
        return null;
    }

    public void doDispatch(){

        //HttpController httpController = new HttpController();
        AnnotationController httpController = new AnnotationController();
        HandlerAdapter handlerAdapter =getAdapter(httpController);
        handlerAdapter.handle(httpController);
    }

    public static void main(String[] args) {
        new DispatchServlet().doDispatch();
    }

}
