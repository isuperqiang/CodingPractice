package com.richie.learning.algorithm.queue;

/**
 * @author Richie on 2018.03.23
 */
public class QueueTest {

    public static void main(String args[]) {
        MyQueueByArray<Integer> integers = new MyQueueByArray<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }

        for (Integer integer : integers) {
            System.out.print(integer + ", ");
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            integers.poll();
        }

        for (Integer integer : integers) {
            System.out.print(integer + ", ");
        }
    }
}
