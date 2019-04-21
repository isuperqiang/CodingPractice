package com.richie.coding.data_structure.linkedlist;

/**
 * @author richie on 2019.04.17
 */
public class LinkedListTest {

    public static void main(String[] args) {
        //testLruCache();
        // 1->2->3->4->5->NULL
        ListNode listNode = initListNode();
        printListNode(listNode);
        //ListNode reverseList = reverseList(listNode);
        //printListNode(reverseList);
        ListNode midNode = findMidNode(listNode);
        System.out.println("mid " + midNode);
    }

    private static ListNode initListNode() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        return listNode;
    }

    private static void printListNode(ListNode listNode) {
        StringBuilder sb = new StringBuilder();
        ListNode temp = listNode;
        while (temp != null) {
            sb.append(temp.val).append(", ");
            temp = temp.next;
        }
        System.out.println(sb);
    }

    private static ListNode findMidNode(ListNode listNode) {
        if (listNode == null) {
            return null;
        }

        ListNode slow = listNode;
        ListNode fast = listNode;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    /**
     * 反转单链表
     * 1->2->3->4->5->NULL
     *
     * @param head
     * @return
     */
    private static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head.next;
        ListNode prev = head;
        prev.next = null;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
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
