package com.richie.coding.data_structure.stack;

import java.util.EmptyStackException;
import java.util.Iterator;

/**
 * @author Richie on 2018.03.23
 * 双向链表实现的栈
 */
public class MyStackByList<E> implements Iterable<E> {

    private int size;
    private Node first;
    private Node last;

    /**
     * 入栈，放到链表尾部
     *
     * @param elements
     */
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

    /**
     * 出栈，从链表尾部拿
     * @return
     */
    public E pop() {
        if (size > 0) {
            E element = null;
            if (last != null) {
                element = last.element;
                last = last.pre;
                if (last != null) {
                    last.next = null;
                } else {
                    first = null;
                }
            }
            size--;
            return element;
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
            E element = null;
            if (last != null) {
                element = last.element;
            }
            return element;
        } else {
            throw new EmptyStackException();
        }
    }

    public void clear() {
        if (first != null) {
            first.next = null;
        }
        if (last != null) {
            last.pre = null;
        }
        size = 0;
        first = null;
        last = null;
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
        return "ListStack{" +
                "data=" + sb +
                ", size=" + size +
                "}";
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
