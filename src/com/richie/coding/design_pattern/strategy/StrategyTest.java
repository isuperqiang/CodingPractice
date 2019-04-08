package com.richie.coding.design_pattern.strategy;

/**
 * @author Richie on 2018.04.10
 */
public class StrategyTest {
    public static void main(String[] args) {
        OutContext outContext = new OutContext(new CarWay());
        outContext.go2Work();

        outContext.setOutWay(new BusWay());
        outContext.go2Work();
    }
}
