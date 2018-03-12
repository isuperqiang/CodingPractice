package com.richie.learning.design_pattern.factory.simple;

/**
 * @author Richie on 2018.03.12
 */
public class SimplePizzaFactory {

    /**
     * 根据类型 创建 pizza
     *
     * @param type
     * @return
     */
    public static Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new CheesePizza();
        } else if ("greek".equals(type)) {
            return new GreekPizza();
        } else {
            throw new IllegalArgumentException("Invalid pizza type!");
        }
    }

}
