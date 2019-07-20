package com.richie.coding.basic.overrideoverload;

/**
 * @author Richie on 2019.07.20
 */
public class Cat extends Animal {

    public static void classMethod() {
        System.out.println("cat class method");
    }

    @Override
    public void instanceMethod() {
        System.out.println("cat instance method");
    }

    @Override
    public void bark() {
        System.out.println("喵喵");
    }

    public void bark(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println("第 " + i + " 声喵喵");
        }
    }


    public void mo() {
        System.out.println("no param");
    }

    public void mo(int a) {
        System.out.println("primary int type");
    }

    public void mo(long a) {
        System.out.println("primary long type");
    }

    public void mo(Integer a) {
        System.out.println("wrapper int type");
    }

    //    public void mo(String s) {
    //        System.out.println("string type");
    //    }

    public void mo(Integer a, Integer b) {
        System.out.println("double wrapper int type");
    }

    public void mo(int... a) {
        System.out.println("primary int array type");
    }

    public void mo(Object a) {
        System.out.println("object type");
    }

}
