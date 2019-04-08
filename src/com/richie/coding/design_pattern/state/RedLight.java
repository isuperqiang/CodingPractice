package com.richie.coding.design_pattern.state;

/**
 * @author Richie on 2018.03.31
 */
public class RedLight implements ILightState {

    @Override
    public void behave() {
        System.out.println("红灯停");
    }
}
