package com.richie.coding.design_pattern.template_method;

/**
 * @author Richie on 2018.03.20
 */
public class TemplateMethodTest {

    public static void main(String[] args) {
        // 冲咖啡
        CoffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("-----------------");
        // 泡茶
        CoffeineBeverage tea = new Tea();
        tea.prepareRecipe();
    }
}
