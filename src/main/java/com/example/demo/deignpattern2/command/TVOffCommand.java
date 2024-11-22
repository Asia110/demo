package com.example.demo.deignpattern2.command;

public class TVOffCommand implements Command{

    private TVReceiver tvReceiver;


    public TVOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
