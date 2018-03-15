package com.richie.learning.design_pattern.singleton;

/**
 * @author Richie on 2018.03.15
 * 双重校验锁，多线程安全，延迟初始化
 */
public class DoubleCheckSingleton {
    private volatile DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {
    }

    public DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
