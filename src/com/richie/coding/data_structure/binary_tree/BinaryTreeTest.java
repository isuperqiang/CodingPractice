package com.richie.coding.data_structure.binary_tree;

import java.util.LinkedList;

/**
 * @author richie on 2019.04.08
 * 二叉树的定义和遍历
 */
public class BinaryTreeTest {

    public static void main(String[] args) {
        MyTreeNode<String> myTreeNode = initData();
        traverseByBreadth(myTreeNode);
    }

    // 按层次遍历
    private static void traverseByBreadth(MyTreeNode<String> root) {
        LinkedList<MyTreeNode<String>> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            MyTreeNode<String> poll = queue.poll();
            if (poll != null) {
                System.out.println(poll.value);
                queue.offer(poll.left);
                queue.offer(poll.right);
            }
        }
    }

    // 前序遍历
    private static void preOrder(MyTreeNode<String> node) {
        if (node == null) {
            return;
        }

        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    // 中序遍历
    private static void inOrder(MyTreeNode<String> node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    // 后序遍历
    private static void postOrder(MyTreeNode<String> node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }


    private static MyTreeNode<String> initData() {
        MyTreeNode<String> rootA = new MyTreeNode<>("A");
        MyTreeNode<String> leftB = new MyTreeNode<>("B");
        MyTreeNode<String> rightC = new MyTreeNode<>("C");
        rootA.left = leftB;
        rootA.right = rightC;
        MyTreeNode<String> leftD = new MyTreeNode<>("D");
        MyTreeNode<String> rightE = new MyTreeNode<>("E");
        leftB.left = leftD;
        leftB.right = rightE;
        MyTreeNode<String> leftF = new MyTreeNode<>("F");
        MyTreeNode<String> rightG = new MyTreeNode<>("G");
        rightC.left = leftF;
        rightC.right = rightG;
        return rootA;
    }

    static class MyTreeNode<T> {
        T value;
        MyTreeNode<T> left;
        MyTreeNode<T> right;

        MyTreeNode(T value) {
            this.value = value;
        }
    }

}
