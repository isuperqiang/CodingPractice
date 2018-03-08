package com.richie.learning.design_pattern.decorator;

/**
 * @author Richie on 2018.03.08
 * 原味
 */
public class SoybeanMilk implements IMilk {

    @Override
    public String getDescription() {
        return "原味";
    }

    @Override
    public double cost() {
        return 2;
    }
}
