package com.richie.coding.basic.overrideoverload;

/**
 * @author Richie on 2019.07.20
 */
public class TestOverrideOverload {

    public static void main(String[] args) {
        //        Animal animal = new Cat();
        //        animal.instanceMethod();
        //        animal.classMethod();
        //        System.out.println("--------");
        //        Cat cat =  new Cat();
        //        cat.instanceMethod();
        //        cat.classMethod();
        // 输出
        //        cat instance method
        //        animal class method
        //        --------
        //        cat instance method
        //        cat class method

        Cat cat = new Cat();
        //        cat.mo(null); // compile error
        cat.mo(1); // primary int type
        cat.mo(new Integer(1)); // wrapper int type
        cat.mo(Long.MAX_VALUE); // primary long type
        cat.mo(0);
        cat.mo(1, 2);

    }

}
