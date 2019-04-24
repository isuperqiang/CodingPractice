package com.richie.coding.data_structure.stack;

/**
 * @author Richie on 2018.03.21
 * 测试「栈」
 */
public class StackTest {

    public static void main(String args[]) {
        //testStackLink();
        //testStackArray();
        testBrowser();
    }

    private static void testBrowser() {
        BrowserForwardBackward browserForwardBackward = new BrowserForwardBackward();
        //  a -> b -> c
        browserForwardBackward.open("a");
        browserForwardBackward.open("b");
        browserForwardBackward.open("c");
        // a ->  b
        browserForwardBackward.backward();
        browserForwardBackward.backward();
        browserForwardBackward.forward();
        // a -> b -> d
        browserForwardBackward.open("d");
        browserForwardBackward.backward();
        browserForwardBackward.forward();
    }

    private static void testStackArray() {
        MyStackByArray<Integer> myStackByArray = new MyStackByArray<>();
        for (int i = 0; i < 6; i++) {
            myStackByArray.push(i);
        }
        System.out.println(myStackByArray);

        myStackByArray.pop();
        myStackByArray.pop();
        System.out.println(myStackByArray);
    }

    private static void testStackLink() {
        MyStackByList<Integer> myStackByLink = new MyStackByList<>();
        for (int i = 0; i < 6; i++) {
            myStackByLink.push(i);
        }
        System.out.println(myStackByLink);

        myStackByLink.pop();
        myStackByLink.pop();
        System.out.println(myStackByLink);
    }
}
