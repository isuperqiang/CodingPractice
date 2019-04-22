package com.richie.coding.data_structure.linkedlist;

/**
 * @author richie on 2019.04.17
 */
public class LinkedListTest {

    public static void main(String[] args) {
        //testLruCache();
        // 1->2->3->4->5->NULL
        //ListNode listNode = initListNode();
        //printListNode(listNode);
        //ListNode reverseList = reverseList(listNode);
        //printListNode(reverseList);
        //ListNode midNode = findMidNode(listNode);
        //System.out.println("mid " + midNode);

        ListNode l1 = initListNode1();
        printListNode(l1);
        ListNode l2 = initListNode2();
        printListNode(l2);
        ListNode listNode = mergeTwoLists(l1, l2);
        printListNode(listNode);
    }

    private static ListNode initListNode() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        return listNode;
    }

    private static ListNode initListNode1() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        return listNode;
    }

    private static ListNode initListNode2() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(4);
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

    /**
     * 合并两个有序的链表
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     *
     * @param l1
     * @param l2
     * @return
     */
    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode ret = new ListNode(0);
        ListNode retHead = ret;
        ListNode currL1 = l1;
        ListNode currL2 = l2;
        while (currL1 != null && currL2 != null) {
            if (currL1.val < currL2.val) {
                ret.next = currL1;
                ret = ret.next;
                currL1 = currL1.next;
            } else if (currL1.val > currL2.val) {
                ret.next = currL2;
                ret = ret.next;
                currL2 = currL2.next;
            } else {
                ListNode tempL1 = currL1.next;
                ListNode tempL2 = currL2.next;
                ret.next = currL1;
                ret = ret.next;
                ret.next = currL2;
                ret = ret.next;
                currL1 = tempL1;
                currL2 = tempL2;
            }
        }

        while (currL1 != null) {
            ret.next = currL1;
            ret = ret.next;
            currL1 = currL1.next;
        }
        while (currL2 != null) {
            ret.next = currL2;
            ret = ret.next;
            currL2 = currL2.next;
        }
        return retHead.next;
    }

    /**
     * 寻找链表中间结点
     *
     * @param listNode
     * @return
     */
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
