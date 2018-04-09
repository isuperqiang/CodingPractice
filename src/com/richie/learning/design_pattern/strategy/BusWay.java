package com.richie.learning.design_pattern.strategy;

/**
 * @author Richie on 2018.04.10
 */
public class BusWay implements IOutWay {
    @Override
    public void goOut() {
        System.out.println("做公交车");
    }
}
