package com.richie.coding.data_structure.linkedlist;

/**
 * @author richie on 2019.04.17
 * 基于双向链表实现的 LRU 缓存。查询缓存时，如果没有命中，就把它放到链表头部；否则，就把它移动到头部。
 */
public class LRULinkedList {
    private Node<String> head;
    private Node<String> tail;
    private int maxSize = 4;
    private int count;

    /**
     * 添加结点
     *
     * @param s
     */
    public void put(String s) {
        if (count >= maxSize) {
            Node<String> pre = tail.getPre();
            pre.setNext(null);
            tail.setPre(null);
            tail = pre;
        }

        // add to head
        Node<String> node = new Node<>(null, head, s);
        if (head != null) {
            head.setPre(node);
        }
        head = node;
        if (tail == null) {
            tail = node;
        }
        count++;
    }

    /**
     * 获取结点
     *
     * @param s
     * @return
     */
    public String get(String s) {
        if (s == null) {
            return null;
        }
        if (head == null) {
            put(s);
            return s;
        }
        if (s.equals(head.getValue())) {
            return s;
        }
        Node<String> sNode = head;
        boolean contains = false;
        while ((sNode = sNode.getNext()) != null) {
            if (s.equals(sNode.getValue())) {
                contains = true;
                break;
            }
        }
        if (contains) {
            // move to head
            Node<String> pre = sNode.getPre();
            Node<String> nex = sNode.getNext();
            pre.setNext(nex);
            if (nex != null) {
                nex.setPre(pre);
            }
            sNode.setNext(head);
            sNode.setPre(null);
            head = sNode;
        } else {
            put(s);
        }
        return s;
    }

    public void printLinkedList() {
        if (head != null) {
            StringBuilder sb = new StringBuilder(head.getValue()).append(", ");
            Node<String> node = head;
            while ((node = node.getNext()) != null) {
                sb.append(node.getValue()).append(", ");
            }
            System.out.println(sb.toString());
        } else {
            System.out.println("no node");
        }
    }
}
