package com.richie.coding.design_pattern.strategy;

/**
 * @author Richie on 2018.04.10
 */
public class OutContext {
    private IOutWay outWay;

    public OutContext(IOutWay outWay) {
        this.outWay = outWay;
    }

    public void setOutWay(IOutWay outWay) {
        this.outWay = outWay;
    }

    public void go2Work() {
        outWay.goOut();
    }
}
