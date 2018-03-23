package com.richie.learning.algorithm.queue;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Richie on 2018.03.23
 */
public class MyQueueByArray<E> implements Iterable<E> {
    private int size;
    private E[] data;
    private int head;

    public MyQueueByArray() {
        this(8);
    }

    public MyQueueByArray(int size) {
        data = (E[]) new Object[size];
    }

    public void add(E element) {
        if (size == data.length) {
            int newLength = 2 * size + 1;
            E[] dest = (E[]) new Object[newLength];
            System.arraycopy(data, 0, dest, 0, size);
            data = dest;
        }
        data[size++] = element;
    }

    public E poll() {
        if (size > 0) {
            E datum = data[0];
            data[0] = null;
            size--;
            head++;
            //if (size == data.length / 4) {
            //    int newLength = data.length / 2;
            //    // 减容
            //    Object[] dest = new Object[newLength];
            //    System.arraycopy(data, 0, dest, 0, newLength);
            //    data = (E[]) dest;
            //}
            return datum;
        } else {
            throw new NoSuchElementException();
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new InnerIterator();
    }

    private class InnerIterator implements Iterator<E> {
        private int current = head;

        @Override
        public boolean hasNext() {
            return current < size + head;
        }

        @Override
        public E next() {
            return data[current++];
        }
    }
}
