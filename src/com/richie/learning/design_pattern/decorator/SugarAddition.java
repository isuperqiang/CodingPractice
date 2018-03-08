package com.richie.learning.design_pattern.decorator;

/**
 * @author Richie on 2018.03.08
 * 加糖
 */
public class SugarAddition extends MilkAddition {

    public SugarAddition(IMilk milk) {
        super(milk);
    }

    @Override
    public String getDescription() {
        return milk.getDescription() + " + 糖";
    }

    @Override
    public double cost() {
        return milk.cost() + 0.5;
    }
}
