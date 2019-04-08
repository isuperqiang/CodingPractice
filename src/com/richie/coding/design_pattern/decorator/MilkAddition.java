package com.richie.coding.design_pattern.decorator;

/**
 * @author Richie on 2018.03.08
 * 添加物
 */
public abstract class MilkAddition implements IMilk {
    protected IMilk milk;

    public MilkAddition(IMilk milk) {
        this.milk = milk;
    }
}
