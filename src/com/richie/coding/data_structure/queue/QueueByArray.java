package com.richie.coding.data_structure.queue;

import java.util.Iterator;

/**
 * @author Richie on 2018.03.23
 * 数组实现的队列，最多存放 size-1 个元素
 */
public class QueueByArray<E> implements Iterable<E> {
    private int size;
    private E[] data;
    private int head;
    private int tail;

    public QueueByArray() {
        this(8);
    }

    public QueueByArray(int size) {
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
        // 队尾没有空间
        if (tail == size) {
            // 队列已满
            if (head == 0) {
                return false;
            }
            System.out.println("move element, head " + head + ", tail " + tail);
            // 移动元素，从尾部向首部搬移
            for (int i = head; i < tail; i++) {
                data[i - head] = data[i];
            }
            tail -= head;
            head = 0;
        }
        data[tail++] = element;
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
        return data[head++];
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
        return "ArrayQueue{" +
                "data=" + sb +
                ", size=" + (tail - head) +
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
            return current < tail;
        }

        @Override
        public E next() {
            return data[current++];
        }
    }
}
