package com.richie.coding.data_structure.search;

/**
 * @author Richie on 2018.03.04
 * 二分查找
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 6, 7, 8, 9};
        int i = searchIterative(6, a);
        System.out.println(i);
        int j = searchRecursive(6, a);
        System.out.println(j);
    }

    // 迭代实现
    private static int searchIterative(int key, int[] array) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (key < array[mid]) {
                high = mid - 1;
            } else if (key > array[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // 递归实现
    private static int searchRecursive(int key, int[] array) {
        return searchRecursiveInternal(key, 0, array.length - 1, array);
    }

    private static int searchRecursiveInternal(int key, int low, int high, int[] array) {
        int mid = low + ((high - low) >> 1);
        if (key < array[mid]) {
            return searchRecursiveInternal(key, low, mid - 1, array);
        } else if (key > array[mid]) {
            return searchRecursiveInternal(key, mid + 1, high, array);
        } else {
            return mid;
        }
    }


}
