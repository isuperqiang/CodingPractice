package com.richie.coding.design_pattern.singleton;

/**
 * @author Richie on 2018.03.15
 * 静态内部类，多线程安全，延迟初始化
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
    }

    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void doSomething() {
        System.out.println("I am " + getClass().getSimpleName());
    }

    private static class SingletonHolder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }
}
