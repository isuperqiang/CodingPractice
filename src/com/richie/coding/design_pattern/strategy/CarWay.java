package com.richie.coding.design_pattern.strategy;

/**
 * @author Richie on 2018.04.10
 */
public class CarWay implements IOutWay {
    @Override
    public void goOut() {
        System.out.println("开汽车");
    }
}
