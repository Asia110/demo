package com.example.demo.deignpattern.command;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/14 9:49
 * @Description:
 */
public class LightOnCommand implements Command{

    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver){
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
