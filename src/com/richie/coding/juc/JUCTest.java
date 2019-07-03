package com.richie.coding.juc;

/**
 * @author Richie on 2019.07.03
 */
public class JUCTest {
    public static void main(String[] args) {
        BoundedLinkedList<String> boundedLinkedList = new BoundedLinkedList<>(3);
        for (int i = 0; i < 4; i++) {
            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        String data = "abc" + finalI;
                        if (finalI == 1) {
                            boundedLinkedList.remove(data);
                        }
                        boundedLinkedList.add(data);
                        System.out.println("add " + data);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

    }
}
