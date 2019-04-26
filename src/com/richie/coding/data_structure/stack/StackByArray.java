package com.richie.coding.data_structure.stack;

import java.util.EmptyStackException;
import java.util.Iterator;

/**
 * @author Richie on 2018.03.21
 * 数组实现的栈
 */
public class StackByArray<E> implements Iterable<E> {

    private E[] data;
    private int size;

    public StackByArray() {
        this(8);
    }

    public StackByArray(int size) {
        data = (E[]) new Object[size];
    }

    /**
     * 入栈，从左到右存放
     *
     * @param element
     */
    public void push(E element) {
        if (size == data.length) {
            // 扩容
            int newLength = size << 1;
            System.out.println("enlarge, newSize " + newLength);
            Object[] dest = new Object[newLength];
            System.arraycopy(data, 0, dest, 0, size);
            data = (E[]) dest;
        }
        data[size++] = element;
    }

    /**
     * 出栈，从右到做获取
     *
     * @return
     */
    public E pop() {
        if (size > 0) {
            E datum = data[--size];
            // 避免对象游离
            data[size] = null;
            //if (size == data.length / 4) {
            //    int newLength = data.length / 2;
            //    // 减容
            //    Object[] dest = new Object[newLength];
            //    System.arraycopy(data, 0, dest, 0, newLength);
            //    data = (E[]) dest;
            //}
            return datum;
        } else {
            throw new EmptyStackException();
        }
    }

    /**
     * 查看栈顶元素
     *
     * @return
     */
    public E peek() {
        if (size > 0) {
            return data[size - 1];
        } else {
            throw new EmptyStackException();
        }
    }

    public void clear() {
        for (int i = size; i > 0; i--) {
            data[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        Iterator<E> iterator = iterator();
        StringBuilder sb = new StringBuilder("[");
        while (iterator.hasNext()) {
            sb.append(iterator.next())
                    .append(", ");
        }
        if (sb.length() > 2) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append("]");
        return "ArrayStack{" +
                "data=" + sb +
                ", size=" + size +
                "}";
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
