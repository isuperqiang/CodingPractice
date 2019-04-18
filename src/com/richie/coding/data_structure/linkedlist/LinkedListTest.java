package com.richie.coding.data_structure.linkedlist;

/**
 * @author richie on 2019.04.17
 */
public class LinkedListTest {

    public static void main(String[] args) {
        testLruCache();
    }

    private static void testLruCache() {
        LRULinkedList list = new LRULinkedList();
        list.get("a");
        list.get("b");
        list.get("c");
        list.get("d");
        list.get("e");
        list.printLinkedList();

        list.get("b");
        list.get("c");
        list.printLinkedList();
    }
}
