package com.richie.learning.design_pattern.factory.factory_method;

import com.richie.learning.design_pattern.factory.simple.Pizza;

/**
 * @author Richie on 2018.03.12
 */
public abstract class PizzaStore {

    public void orderPizza() {
        Pizza pizza = createPizza();
        pizza.bake();
    }

    /**
     * 制作披萨
     *
     * @return
     */
    protected abstract Pizza createPizza();
}
