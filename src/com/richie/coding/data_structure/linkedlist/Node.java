package com.richie.coding.data_structure.linkedlist;

/**
 * @author richie on 2019.04.17
 * 链表结点
 */
class Node<E> {
    private Node pre;
    private Node next;
    private E value;

    public Node(Node pre, Node next, E value) {
        this.pre = pre;
        this.next = next;
        this.value = value;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getPre() {
        return pre;
    }

    public void setPre(Node<E> pre) {
        this.pre = pre;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
