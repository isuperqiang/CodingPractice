package com.richie.learning.design_pattern.singleton;

/**
 * @author Richie on 2018.03.15
 * 饿汉式，多线程安全，非延迟初始化
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
