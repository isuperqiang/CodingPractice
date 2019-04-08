package com.richie.coding.design_pattern.singleton;

/**
 * @author Richie on 2018.03.15
 * 枚举，多线程安全，非延迟初始化
 */
public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("I am " + getClass().getSimpleName());
    }
}
