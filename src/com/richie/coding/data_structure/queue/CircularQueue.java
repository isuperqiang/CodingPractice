package com.richie.coding.data_structure.queue;

import java.util.Iterator;

/**
 * @author richie on 2019.04.25
 * 循环队列
 */
public class CircularQueue<E> implements Iterable {
    // 容量
    private int size;
    private E[] data;
    private int head;
    private int tail;
    // 实际存放的长度
    private int count;

    public CircularQueue() {
        this(8);
    }

    public CircularQueue(int size) {
        data = (E[]) new Object[size];
        this.size = size;
    }

    /**
     * 入队
     *
     * @param element
     * @return
     */
    public boolean enqueue(E element) {
        // 队列已满
        if ((tail + 1) % size == head) {
            return false;
        }
        data[tail] = element;
        tail = (tail + 1) % size;
        count++;
        return true;
    }

    /**
     * 出队
     *
     * @return
     */
    public E dequeue() {
        // 队列为空
        if (head == tail) {
            return null;
        }
        E ele = data[head];
        head = (head + 1) % size;
        count--;
        return ele;
    }

    /**
     * 队首元素
     *
     * @return
     */
    public E peek() {
        if (head == tail) {
            return null;
        }
        return data[head];
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
        return "CircularQueue{" +
                "data=" + sb +
                ", size=" + count +
                "}";
    }

    @Override
    public Iterator<E> iterator() {
        return new InnerIterator();
    }

    private class InnerIterator implements Iterator<E> {
        private int current = head;

        @Override
        public boolean hasNext() {
            return current != tail;
        }

        @Override
        public E next() {
            E ele = data[current];
            current = (current + 1) % size;
            return ele;
        }
    }
}
