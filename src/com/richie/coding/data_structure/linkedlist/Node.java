package com.richie.coding.data_structure.linkedlist;

/**
 * @author richie on 2019.04.17
 * 链表结点
 */
class Node<T> {
    private Node pre;
    private Node next;
    private T value;

    public Node(Node pre, Node next, T value) {
        this.pre = pre;
        this.next = next;
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getPre() {
        return pre;
    }

    public void setPre(Node<T> pre) {
        this.pre = pre;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
