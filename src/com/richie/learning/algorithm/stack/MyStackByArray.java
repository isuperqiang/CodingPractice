package com.richie.learning.algorithm.stack;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Iterator;

/**
 * @author Richie on 2018.03.21
 * 栈：后进先出。由数组实现
 */
public class MyStackByArray<E> implements Iterable<E> {

    private E[] mData;
    private int size;

    public MyStackByArray() {
        this(8);
    }

    public MyStackByArray(int size) {
        mData = (E[]) new Object[size];
    }

    public void push(E data) {
        if (size == mData.length) {
            // 扩容
            int newLength = size * 2 + 1;
            Object[] dest = new Object[newLength];
            System.arraycopy(mData, 0, dest, 0, mData.length);
            mData = (E[]) dest;
        }
        mData[size++] = data;
    }

    public E pop() {
        if (size > 0) {
            E datum = mData[--size];
            // 避免对象游离
            mData[size] = null;
            if (size == mData.length / 4) {
                int newLength = mData.length / 2;
                // 减容
                Object[] dest = new Object[newLength];
                System.arraycopy(mData, 0, dest, 0, newLength);
                mData = (E[]) dest;
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
                "data=" + Arrays.toString(mData) +
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
            return mData[index++];
        }
    }
}
