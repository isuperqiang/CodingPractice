package com.richie.learning.design_pattern.singleton;

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

    private static class SingletonHolder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    public void doSomething() {
        System.out.println("I am " + getClass().getSimpleName());
    }
}
