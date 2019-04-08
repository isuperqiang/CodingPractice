package com.richie.coding.algorithm.stack;

import java.util.EmptyStackException;
import java.util.Iterator;

/**
 * @author Richie on 2018.03.23
 * 双向链表实现的栈
 */
public class MyStackByLink<E> implements Iterable<E> {

    private int size;
    private Node first;
    private Node last;

    public MyStackByLink() {

    }

    public void push(E elements) {
        if (first == null) {
            first = new Node();
            first.element = elements;
            last = first;
        } else {
            Node node = new Node();
            node.element = elements;
            node.pre = last;
            last.next = node;
            last = node;
        }
        size++;
    }

    public E pop() {
        if (size > 0) {
            E element = last.element;
            last.next = null;
            last = last.pre;
            size--;
            return element;
        } else {
            throw new EmptyStackException();
        }
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyStackByLink{" +
                "size=" + size +
                ", first=" + first +
                ", last=" + last +
                '}';
    }

    @Override
    public Iterator<E> iterator() {
        return new InnerIterator();
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
        E element;
        Node pre;
        Node next;
    }
}
