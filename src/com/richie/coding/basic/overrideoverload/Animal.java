package com.richie.coding.basic.overrideoverload;

/**
 * @author Richie on 2019.07.20
 */
public class Animal {

    public static void classMethod() {
        System.out.println("animal class method");
    }

    public void instanceMethod() {
        System.out.println("animal instance method");
    }

    public void instanceMethod(int a, int b) {
        System.out.println("animal instance method");
    }

    public void bark() {
        System.out.println("动物叫声");
    }

}
