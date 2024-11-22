package com.example.demo.deignpattern2.command;

public class RemoteController {

    Command[] onCommands;

    Command[] offCommands;

    Command undoCommand;


    public RemoteController(){
        onCommands= new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i]= new NoCommand();
            offCommands[i]= new NoCommand();
        }

    }

    public void setCommand(int no, Command onCommand, Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    //按下开按钮
    public  void onButtonWasPushed(int no){
        //打开按钮
        onCommands[no].execute();
        //记录这次操作的命令  用于撤销
        undoCommand=onCommands[no];
    }

    public  void offButtonWasPushed(int no) {
        //打开按钮
        offCommands[no].execute();
        //记录这次操作的命令  用于撤销
        undoCommand = offCommands[no];
    }

    //撤销按钮
    public  void undoButtonWasPushed() {
        undoCommand.undo();
    }

}
