package com.richie.learning.design_pattern.decorator;

/**
 * @author Richie on 2018.03.08
 * 加绿豆
 */
public class MungBeanAddition extends MilkAddition {

    public MungBeanAddition(IMilk milk) {
        super(milk);
    }

    @Override
    public String getDescription() {
        return milk.getDescription() + " + 绿豆";
    }

    @Override
    public double cost() {
        return milk.cost() + 2;
    }
}
