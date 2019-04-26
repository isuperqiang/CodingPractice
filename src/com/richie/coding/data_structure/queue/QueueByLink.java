package com.richie.coding.data_structure.queue;

import java.util.Iterator;

/**
 * @author Richie on 2018.03.23
 * 链表实现的队列
 */
public class QueueByLink<E> implements Iterable<E> {

    private int size;
    private Node head;
    private Node tail;

    /**
     * 入队
     *
     * @param element
     */
    public void enqueue(E element) {
        if (head == null) {
            head = new Node();
            head.element = element;
            tail = head;
        } else {
            Node node = new Node();
            node.element = element;
            tail.next = node;
            tail = node;
        }
        size++;
    }

    /**
     * 出队
     *
     * @return
     */
    public E dequeue() {
        if (size <= 0) {
            return null;
        }
        E element = head.element;
        head = head.next;
        size--;
        return element;
    }

    /**
     * 队首元素
     *
     * @return
     */
    public E peek() {
        if (size <= 0) {
            return null;
        }
        return head.element;
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
        return "ListQueue{" +
                "data=" + sb +
                ", size=" + size +
                "}";
    }

    @Override
    public Iterator<E> iterator() {
        return new InnerIterator();
    }

    private class InnerIterator implements Iterator<E> {
        private Node current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            E element = current.element;
            current = current.next;
            return element;
        }
    }

    private class Node {
        private E element;
        private Node next;
    }
}
