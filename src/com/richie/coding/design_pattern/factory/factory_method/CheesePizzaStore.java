package com.richie.coding.design_pattern.factory.factory_method;

import com.richie.coding.design_pattern.factory.simple.CheesePizza;
import com.richie.coding.design_pattern.factory.simple.Pizza;

/**
 * @author Richie on 2018.03.12
 */
public class CheesePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza() {
        return new CheesePizza();
    }
}
