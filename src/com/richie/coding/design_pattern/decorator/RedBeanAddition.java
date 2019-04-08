package com.richie.coding.design_pattern.decorator;

/**
 * @author Richie on 2018.03.08
 * 加红豆
 */
public class RedBeanAddition extends MilkAddition {

    public RedBeanAddition(IMilk milk) {
        super(milk);
    }

    @Override
    public String getDescription() {
        return milk.getDescription() + " + 红豆";
    }

    @Override
    public double cost() {
        return milk.cost() + 3;
    }
}
