package com.example.demo.deignpattern.command;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/14 10:08
 * @Description:
 */
public class LightOffCommand implements Command{

    LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver receiver){
        this.lightReceiver = receiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
