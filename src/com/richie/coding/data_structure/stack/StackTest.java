package com.richie.coding.data_structure.stack;

/**
 * @author Richie on 2018.03.21
 */
public class StackTest {

    public static void main(String args[]) {

        MyStackByLink<Integer> myStackByLink = new MyStackByLink<>();
        for (int i = 0; i < 50; i++) {
            myStackByLink.push(i);
        }

        for (Integer integer : myStackByLink) {
            System.out.print(integer + ", ");
        }

        System.out.println();

        for (int i = 0; i < 33; i++) {
            myStackByLink.pop();
        }

        for (Integer integer : myStackByLink) {
            System.out.print(integer + ", ");
        }
    }
}
