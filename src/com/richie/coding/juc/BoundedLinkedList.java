package com.richie.coding.juc;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Semaphore;

/**
 * @author Richie on 2019.07.03
 */
public class BoundedLinkedList<T> {
    private final List<T> list;
    private final Semaphore semaphore;

    public BoundedLinkedList(int bound) {
        list = Collections.synchronizedList(new LinkedList<>());
        if (bound <= 0) {
            bound = 4;
        }
        semaphore = new Semaphore(bound);
    }

    public boolean add(T data) throws InterruptedException {
        semaphore.acquire();
        return list.add(data);
    }

    public void remove(T data) {
        list.remove(data);
        semaphore.release();
    }

}
