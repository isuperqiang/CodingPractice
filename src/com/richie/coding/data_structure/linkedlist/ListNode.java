package com.richie.coding.data_structure.linkedlist;

/**
 * @author richie on 2019.04.22
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}
