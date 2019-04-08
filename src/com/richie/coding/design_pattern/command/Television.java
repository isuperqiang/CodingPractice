package com.richie.coding.design_pattern.command;

/**
 * @author Richie on 2018.03.15
 * 电视机，接收者角色
 */
public class Television {

    public void turnOn() {
        System.out.println("Turn on television");
    }

    public void turnOff() {
        System.out.println("Turn off television");
    }
}
