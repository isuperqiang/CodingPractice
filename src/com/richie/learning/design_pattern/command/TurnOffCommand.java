package com.richie.learning.design_pattern.command;

/**
 * @author Richie on 2018.03.15
 * 关闭命令，具体命令角色
 */
public class TurnOffCommand implements ICommand {
    private Television television;

    public TurnOffCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOff();
    }
}
