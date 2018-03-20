package com.richie.learning.design_pattern.template_method;

/**
 * @author Richie on 2018.03.20
 */
public class Coffee extends CoffeineBeverage {

    @Override
    protected void addCondiment() {
        System.out.println("加入咖啡");
    }
}
