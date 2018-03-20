package com.richie.learning.design_pattern.template_method;

/**
 * @author Richie on 2018.03.20
 */
public abstract class CoffeineBeverage {

    /**
     * 模版方法，不允许子类覆盖
     */
    public final void prepareRecipe() {
        boilWater();
        addCondiment();
        brew();
        if (isAddSugar()) {
            System.out.println("加糖");
        }
    }

    private void boilWater() {
        System.out.println("烧水");
    }

    private void brew() {
        System.out.println("冲泡");
    }

    /**
     * 是否加糖，钩子方法
     *
     * @return
     */
    protected boolean isAddSugar() {
        return true;
    }

    /**
     * 加料
     */
    protected abstract void addCondiment();
}

