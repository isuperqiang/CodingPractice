package com.richie.learning.design_pattern.state;

/**
 * @author Richie on 2018.03.31
 */
public class GreenLight implements ILightState {

    @Override
    public void behave() {
        System.out.println("绿灯行");
    }
}
