package com.example.demo.ListenerAndEvent;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author chenyaguo
 * @date 2021/11/19 16:07
 */
//@Component
//public class DefinitionApplicationListener implements ApplicationListener<ApplicationEvent> {
//
//    @Override
//    public void onApplicationEvent(ApplicationEvent applicationEvent) {
//
//        System.out.println("事件触发："+applicationEvent.getClass().getName());
//    }
//
//    private ApplicationEventPublisher eventPublisher;
//
//    public void pushListener(String msg){
//        eventPublisher.publishEvent( new DefinitionEvent(this,false));
//    }
//}
