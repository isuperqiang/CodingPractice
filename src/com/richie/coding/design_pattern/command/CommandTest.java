package com.richie.coding.design_pattern.command;

/**
 * @author Richie on 2018.03.15
 */
public class CommandTest {

    public static void main(String[] args) {
        Television television = new Television();

        TurnOnCommand turnOnCommand = new TurnOnCommand(television);
        RemoteControl remoteControl = new RemoteControl(turnOnCommand);
        remoteControl.turnOnTv();

        TurnOffCommand turnOffCommand = new TurnOffCommand(television);
        remoteControl.setCommand(turnOffCommand);
        remoteControl.turnOffTv();
    }
}
