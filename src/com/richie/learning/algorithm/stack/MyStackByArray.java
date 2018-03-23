package com.richie.learning.algorithm.stack;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Iterator;

/**
 * @author Richie on 2018.03.21
 * 栈：后进先出。由数组实现
 */
public class MyStackByArray<E> implements Iterable<E> {

    private E[] data;
    private int size;

    public MyStackByArray() {
        this(8);
    }

    public MyStackByArray(int size) {
        data = (E[]) new Object[size];
    }

    public void push(E element) {
        if (size == data.length) {
            // 扩容
            int newLength = 2 * size + 1;
            Object[] dest = new Object[newLength];
            System.arraycopy(data, 0, dest, 0, size);
            data = (E[]) dest;
        }
        data[size++] = element;
    }

    public E pop() {
        if (size > 0) {
            E datum = data[--size];
            // 避免对象游离
            data[size] = null;
            if (size == data.length / 4) {
                int newLength = data.length / 2;
                // 减容
                Object[] dest = new Object[newLength];
                System.arraycopy(data, 0, dest, 0, newLength);
                data = (E[]) dest;
            }
            return datum;
        } else {
            throw new EmptyStackException();
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    @Override
    public Iterator<E> iterator() {
        return new InnerIterator();
    }

    private class InnerIterator implements Iterator<E> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public E next() {
            return data[index++];
        }
    }
}
