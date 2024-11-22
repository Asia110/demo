package com.example.demo.deignpattern.command;

import org.checkerframework.checker.units.qual.C;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/14 10:23
 * @Description:
 */
public class RemoteController {

    //开 按钮的命令数组
    Command[] onCommands;
    //关 按钮的命令数组
    Command[] offCommands;

    Command uodoCommand;

    //构造器 完成对按钮的初始化
    public  RemoteController(){
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i]= new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //给我们的按钮设置你需要的命令
    public void setCommand(int no,Command onCommand, Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    //按下开按钮
    public  void onButtonWasPushed(int no){
        //打开按钮
        onCommands[no].execute();
        //记录这次操作的命令  用于撤销
        uodoCommand=onCommands[no];
    }

    public  void offButtonWasPushed(int no) {
        //打开按钮
        offCommands[no].execute();
        //记录这次操作的命令  用于撤销
        uodoCommand = offCommands[no];
    }

    //撤销按钮
    public  void undoButtonWasPushed() {
        uodoCommand.undo();
    }
}
