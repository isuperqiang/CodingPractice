package com.richie.coding.design_pattern.factory.abs_factory;

/**
 * @author Richie on 2018.03.12
 */
public abstract class Drink {

    public void taste() {
        System.out.println("taste " + getDesc());
    }

    /**
     * 饮料描述
     *
     * @return
     */
    protected abstract String getDesc();
}
