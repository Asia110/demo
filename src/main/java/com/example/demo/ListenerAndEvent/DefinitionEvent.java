package com.example.demo.ListenerAndEvent;

import org.springframework.context.ApplicationEvent;

/**
 * @author chenyaguo
 * @date 2021/11/19 16:43
 */
public class DefinitionEvent extends ApplicationEvent {


    public boolean enable;

    public DefinitionEvent(Object source, boolean enable) {
        super(source);
        this.enable = enable;
    }
}
