package com.richie.learning.design_pattern.singleton;

/**
 * @author Richie on 2018.03.15
 */
public class SingletonTest {

    public static void main(String[] args) {
        DoubleCheckSingleton.getInstance().doSomething();
        EnumSingleton.INSTANCE.doSomething();
        HungrySingleton.getInstance().doSomething();
        StaticInnerClassSingleton.getInstance().doSomething();
    }
}
