package com.example.demo.deignpattern.command;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/14 16:27
 * @Description:
 */
public class Client {


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
