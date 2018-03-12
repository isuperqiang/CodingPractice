package com.richie.learning.design_pattern.factory.abs_factory;

import com.richie.learning.design_pattern.factory.simple.Pizza;

/**
 * @author Richie on 2018.03.12
 */
public interface IPizzaStore {
    /**
     * 制作披萨
     *
     * @return
     */
    Pizza createPizza();

    /**
     * 制作饮料
     *
     * @return
     */
    Drink createDrink();
}
