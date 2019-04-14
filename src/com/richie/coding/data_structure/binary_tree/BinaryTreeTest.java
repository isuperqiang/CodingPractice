package com.richie.coding.data_structure.binary_tree;

import java.util.LinkedList;

/**
 * @author richie on 2019.04.08
 * 二叉树的定义和遍历
 */
public class BinaryTreeTest {

    public static void main(String[] args) {
        //MyTreeNode<String> myTreeNode = initStringData();
        //traverseByBreadth(myTreeNode);

        MyTreeNode<Integer> myTreeNode = initIntegerData();
        inOrderInteger(myTreeNode);
        System.out.println("\n---------------------------");

        //MyTreeNode<Integer> search = search(myTreeNode, 5);
        //System.out.println(search);

        //MyTreeNode<Integer> insert = insert(myTreeNode, 6);
        //System.out.println(insert);

        MyTreeNode<Integer> delete = delete(myTreeNode, 8);
        System.out.println(delete);

        inOrderInteger(myTreeNode);
        /*
         *       8
         *    /     \
         *   5      11
         *  / \    /
         * 2   7  9
         *
         */
    }

    /**
     * 二叉查找树搜索
     *
     * @param root
     * @param target
     * @return
     */
    private static MyTreeNode<Integer> search(MyTreeNode<Integer> root, int target) {
        if (root == null) {
            return null;
        }

        MyTreeNode<Integer> p = root;
        while (p != null) {
            if (p.value < target) {
                p = p.right;
            } else if (p.value > target) {
                p = p.left;
            } else {
                break;
            }
        }
        return p;
    }

    /**
     * 二叉查找树插入
     *
     * @param root
     * @param target
     * @return
     */
    private static MyTreeNode<Integer> insert(MyTreeNode<Integer> root, int target) {
        if (root == null) {
            return new MyTreeNode<>(target);
        }

        MyTreeNode<Integer> p = root;
        MyTreeNode<Integer> newNode = null;
        while (true) {
            if (p.value < target) {
                if (p.right == null) {
                    newNode = new MyTreeNode<>(target);
                    p.right = newNode;
                    break;
                }
                p = p.right;
            } else if (p.value > target) {
                if (p.left == null) {
                    newNode = new MyTreeNode<>(target);
                    p.left = newNode;
                    break;
                }
                p = p.left;
            } else { // 如果目标值存在，那么不插入
                break;
            }
        }
        return newNode;
    }

    /**
     * 二叉查找树删除
     *
     * @param root
     * @param target
     * @return
     */
    private static MyTreeNode<Integer> delete(MyTreeNode<Integer> root, int target) {
        if (root == null) {
            return null;
        }

        // 分三种情况讨论：要删除的节点有两个子节点，有一个子节点和没有子节点。
        MyTreeNode<Integer> targetNode = root; // 目标节点
        MyTreeNode<Integer> targetParentNode = null; // 目标节点父节点
        while (targetNode != null) {
            if (targetNode.value < target) {
                targetParentNode = targetNode;
                targetNode = targetNode.right;
            } else if (targetNode.value > target) {
                targetParentNode = targetNode;
                targetNode = targetNode.left;
            } else {
                break;
            }
        }

        // 树中不存在目标值
        if (targetNode == null) {
            return null;
        }
        System.out.println("parent " + targetParentNode + ", target " + targetNode);
        // 两个子节点
        /*
         *       8
         *    /     \
         *   5      11
         *  / \    /
         * 2   7  9
         *
         */
        if (targetNode.left != null && targetNode.right != null) {
            MyTreeNode<Integer> rightMin = targetNode.right;
            MyTreeNode<Integer> rightMinParent = targetNode;
            while (rightMin.left != null) {
                rightMinParent = rightMin;
                rightMin = rightMin.left;
            }
            System.out.println("rightMin " + rightMin);
            if (targetParentNode != null) {
                if (targetParentNode.value < target) {
                    targetParentNode.right = rightMin;
                    rightMin.left = targetNode.left;
                } else {
                    targetParentNode.left = rightMin;
                    rightMin.left = targetNode.left;
                }
            } else {
                root.value = rightMin.value;
            }
            rightMinParent.left = null;
        } else if (targetNode.left != null || targetNode.right != null) {
            // 一个子节点
            if (targetParentNode != null) {
                if (targetParentNode.value < target) {
                    targetParentNode.right = targetNode.left != null ? targetNode.left : targetNode.right;
                } else {
                    targetParentNode.left = targetNode.left != null ? targetNode.left : targetNode.right;
                }
            } else {
                if (root.value < target) {
                    root.right = null;
                } else {
                    root.left = null;
                }
            }
        } else {
            // 没有子节点
            if (targetParentNode != null) {
                if (targetParentNode.value > target) {
                    targetParentNode.left = null;
                } else {
                    targetParentNode.right = null;
                }
            } else {
                root.value = null;
            }
        }
        return targetNode;
    }

    /**
     * 按层次遍历树
     *
     * @param root
     */
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

    /**
     * 前序遍历
     *
     * @param node
     */
    private static void preOrder(MyTreeNode<String> node) {
        if (node == null) {
            return;
        }

        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }


    /**
     * 中序遍历
     *
     * @param node
     */
    private static void inOrder(MyTreeNode<String> node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }


    /**
     * 中序遍历
     *
     * @param node
     */
    private static void inOrderInteger(MyTreeNode<Integer> node) {
        if (node == null) {
            return;
        }

        inOrderInteger(node.left);
        System.out.print(node.value + ", ");
        inOrderInteger(node.right);
    }


    /**
     * 后序遍历
     *
     * @param node
     */
    private static void postOrder(MyTreeNode<String> node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }

    /*
     *      A
     *    /   \
     *   B     C
     *  / \   / \
     * D   E F   G
     */
    private static MyTreeNode<String> initStringData() {
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

    /*
     *       8
     *    /     \
     *   5      11
     *  / \    /
     * 2   7  9
     */
    private static MyTreeNode<Integer> initIntegerData() {
        MyTreeNode<Integer> root8 = new MyTreeNode<>(8);
        MyTreeNode<Integer> left5 = new MyTreeNode<>(5);
        MyTreeNode<Integer> right11 = new MyTreeNode<>(11);
        root8.left = left5;
        root8.right = right11;
        MyTreeNode<Integer> left2 = new MyTreeNode<>(2);
        MyTreeNode<Integer> right7 = new MyTreeNode<>(7);
        left5.left = left2;
        left5.right = right7;
        MyTreeNode<Integer> left9 = new MyTreeNode<>(9);
        right11.left = left9;
        return root8;
    }

    static class MyTreeNode<T> {
        T value;
        MyTreeNode<T> left;
        MyTreeNode<T> right;

        MyTreeNode(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "TreeNode: " + value;
        }
    }

}
