package com.example.demo.deignpattern.command;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/14 16:46
 * @Description:
 */
public class TVOffCommand implements Command{

    TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver){
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.off();
    }

    @Override
    public void undo() {
        tvReceiver.on();
    }
}
