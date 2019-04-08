package com.richie.coding.algorithm.queue;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Richie on 2018.03.23
 * 队列：先进先出，由链表实现
 */
public class MyQueueByStack<E> implements Iterable<E> {

    private int size;
    private Node first;
    private Node last;

    public MyQueueByStack() {
    }

    public void add(E element) {
        if (first == null) {
            first = new Node();
            first.element = element;
            last = first;
        } else {
            Node node = new Node();
            node.element = element;
            node.pre = last;
            last.next = node;
            last = node;
        }
        size++;
    }

    public E poll() {
        if (size > 0) {
            E element = first.element;
            first = first.next;
            first.pre = null;
            return element;
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

    @Override
    public String toString() {
        return "MyQueueByStack{" +
                "size=" + size +
                ", first=" + first +
                ", last=" + last +
                '}';
    }

    private class InnerIterator implements Iterator<E> {
        private Node current = first;

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
        private Node pre;
        private Node next;
    }
}
