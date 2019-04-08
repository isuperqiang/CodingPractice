package com.richie.coding.design_pattern.command;

/**
 * @author Richie on 2018.03.15
 * 打开命令，具体命令角色
 */
public class TurnOnCommand implements ICommand {
    private Television television;

    public TurnOnCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOn();
    }
}
