package com.richie.coding.design_pattern.decorator;

/**
 * @author Richie on 2018.03.08
 */
public class MilkTest {

    public static void main(String[] args) {
        // 原味豆浆，两块钱
        IMilk milk = new SoybeanMilk();
        // 加糖，五毛钱
        milk = new SugarAddition(milk);
        // 加红豆，三块钱
        milk = new RedBeanAddition(milk);
        // 加绿豆，两块钱
        //milk = new MungBeanAddition(milk);

        System.out.println("喝到的豆浆：" + milk.getDescription() + ", 价格：" + milk.cost() + "元");
    }
}
