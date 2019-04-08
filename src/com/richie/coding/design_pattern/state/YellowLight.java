package com.richie.coding.design_pattern.state;

/**
 * @author Richie on 2018.03.31
 */
public class YellowLight implements ILightState {

    @Override
    public void behave() {
        System.out.println("黄灯亮了等一等");
    }
}
