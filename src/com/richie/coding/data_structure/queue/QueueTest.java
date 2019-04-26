package com.richie.coding.data_structure.queue;

/**
 * @author Richie on 2018.03.23
 */
public class QueueTest {

    public static void main(String args[]) {
        //testArrayQueue();
        //testLinkQueue();
        testCircularQueue();
    }

    private static void testCircularQueue() {
        CircularQueue<Integer> circularQueue = new CircularQueue<>(8);
        for (int i = 0; i < 6; i++) {
            circularQueue.enqueue(i);
        }
        System.out.println(circularQueue);

        for (int i = 0; i < 3; i++) {
            circularQueue.dequeue();
        }
        System.out.println(circularQueue);

        for (int i = 0; i < 4; i++) {
            circularQueue.enqueue(i);
        }
        System.out.println(circularQueue);
    }

    private static void testLinkQueue() {
        QueueByLink<Integer> queueByLink = new QueueByLink<>();
        for (int i = 0; i < 6; i++) {
            queueByLink.enqueue(i);
        }
        System.out.println(queueByLink);

        queueByLink.dequeue();
        queueByLink.dequeue();
        System.out.println(queueByLink);

        for (int i = 0; i < 3; i++) {
            queueByLink.enqueue(i + 3);
        }
        System.out.println(queueByLink);
        System.out.println("peek " + queueByLink.peek());
    }

    private static void testArrayQueue() {
        QueueByArray<Integer> queueByArray = new QueueByArray<>();
        for (int i = 0; i < 6; i++) {
            queueByArray.enqueue(i);
        }
        System.out.println(queueByArray);

        queueByArray.dequeue();
        queueByArray.dequeue();
        System.out.println(queueByArray);

        for (int i = 0; i < 3; i++) {
            queueByArray.enqueue(i + 3);
        }
        System.out.println(queueByArray);
        System.out.println("peek " + queueByArray.peek());
    }
}
