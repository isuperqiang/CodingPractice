package com.richie.learning.design_pattern.factory.abs_factory;

import com.richie.learning.design_pattern.factory.simple.GreekPizza;
import com.richie.learning.design_pattern.factory.simple.Pizza;

/**
 * @author Richie on 2018.03.12
 */
public class ParisPizzaStore implements IPizzaStore {

    @Override
    public Pizza createPizza() {
        return new GreekPizza();
    }

    @Override
    public Drink createDrink() {
        return new Coffee();
    }
}
