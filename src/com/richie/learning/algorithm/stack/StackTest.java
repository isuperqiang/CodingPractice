package com.richie.learning.algorithm.stack;

/**
 * @author Richie on 2018.03.21
 */
public class StackTest {

    public static void main(String args[]) {

        MyStack<Integer> integerMyStack = new MyStack<>();

        for (int i = 0; i < 10; i++) {
            integerMyStack.push(i);
        }

        for (Integer integer : integerMyStack) {
            System.out.print(integer + ", ");
        }
        System.out.println("size:" + integerMyStack.size());

        for (int i = 0; i < 8; i++) {
            integerMyStack.pop();
        }

        System.out.println("------------");

        for (Integer integer : integerMyStack) {
            System.out.print(integer + ", ");
        }
        System.out.println("size:" + integerMyStack.size());

    }
}
