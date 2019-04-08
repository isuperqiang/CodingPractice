package com.richie.coding.design_pattern.command;

/**
 * @author Richie on 2018.03.15
 * 遥控器，调用者角色
 */
public class RemoteControl {
    private ICommand command;

    public RemoteControl(ICommand command) {
        this.command = command;
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void turnOnTv() {
        command.execute();
    }

    public void turnOffTv() {
        command.execute();
    }
}
