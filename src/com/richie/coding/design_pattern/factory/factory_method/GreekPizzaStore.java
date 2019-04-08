package com.richie.coding.design_pattern.factory.factory_method;

import com.richie.coding.design_pattern.factory.simple.GreekPizza;
import com.richie.coding.design_pattern.factory.simple.Pizza;

/**
 * @author Richie on 2018.03.12
 */
public class GreekPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza() {
        return new GreekPizza();
    }
}
