package com.richie.learning.design_pattern.strategy;

/**
 * @author Richie on 2018.04.10
 */
public class BikeWay implements IOutWay {
    @Override
    public void goOut() {
        System.out.println("骑自行车");
    }
}
