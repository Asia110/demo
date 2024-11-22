package com.example.demo.deignpattern2.command;

import com.example.demo.deignpattern.command.LightOffCommand;
import com.example.demo.deignpattern.command.LightOnCommand;
import com.example.demo.deignpattern.command.LightReceiver;
import com.example.demo.deignpattern.command.RemoteController;
import com.example.demo.deignpattern.command.TVOffCommand;
import com.example.demo.deignpattern.command.TVOnCommand;
import com.example.demo.deignpattern.command.TVReceiver;

public class client {

    public static void main(String[] args) {


        //创建命令接收者
        LightReceiver lightReceiver = new LightReceiver();

        //创建命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //遥控器
        RemoteController controller= new RemoteController();

        controller.setCommand(0,lightOnCommand,lightOffCommand);
        controller.onButtonWasPushed(0);
        //controller.offButtonWasPushed(0);
        controller.undoButtonWasPushed();
        System.out.println("=======================");

        TVReceiver tvReceiver = new TVReceiver();

        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);

        controller.setCommand(1,tvOnCommand,tvOffCommand);

        controller.onButtonWasPushed(1);
        controller.undoButtonWasPushed();
    }
}
