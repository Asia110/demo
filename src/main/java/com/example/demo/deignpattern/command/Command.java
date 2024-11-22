package com.example.demo.deignpattern.command;

/**
 * @Author: chenyaguo@jd.com
 * @Date: 2022/8/14 9:46
 * @Description:
 */
public interface Command {
    //命令执行操作
    void execute();

    //命令撤销操作
    void undo();

}
