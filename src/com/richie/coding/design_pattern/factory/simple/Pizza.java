package com.richie.coding.design_pattern.factory.simple;

/**
 * @author Richie on 2018.03.12
 */
public abstract class Pizza {

    public void bake() {
        System.out.println("bake " + desc());
    }

    /**
     * 披萨描述
     *
     * @return
     */
    protected abstract String desc();
}
