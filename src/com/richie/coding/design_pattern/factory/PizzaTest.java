package com.richie.coding.design_pattern.factory;

import com.richie.coding.design_pattern.factory.abs_factory.Drink;
import com.richie.coding.design_pattern.factory.abs_factory.ParisPizzaStore;
import com.richie.coding.design_pattern.factory.factory_method.CheesePizzaStore;
import com.richie.coding.design_pattern.factory.factory_method.PizzaStore;
import com.richie.coding.design_pattern.factory.simple.Pizza;
import com.richie.coding.design_pattern.factory.simple.SimplePizzaFactory;

/**
 * @author Richie on 2018.03.12
 */
public class PizzaTest {

    public static void main(String[] args) {
        // 简单工厂
        Pizza cheese = SimplePizzaFactory.createPizza("cheese");
        cheese.bake();

        // 工厂方法
        PizzaStore pizzaStore = new CheesePizzaStore();
        pizzaStore.orderPizza();

        // 抽象工厂
        ParisPizzaStore parisPizzaStore = new ParisPizzaStore();
        Drink drink = parisPizzaStore.createDrink();
        drink.taste();
        Pizza pizza = parisPizzaStore.createPizza();
        pizza.bake();
    }

}
