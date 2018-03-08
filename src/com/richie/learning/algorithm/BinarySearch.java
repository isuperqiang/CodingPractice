package com.richie.learning.algorithm;

/**
 * @author Richie on 2018.03.04
 */
public class BinarySearch {

    // 迭代实现
    public static int searchIterative(int key, int[] array) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
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

    public static int searchRecursive(int key, int[] array) {
        return search(key, 0, array.length - 1, array);
    }

    // 递归实现
    private static int search(int key, int low, int high, int[] array) {
        int mid = (low + high) / 2;
        if (key < array[mid]) {
            high = mid - 1;
            return search(key, low, high, array);
        } else if (key > array[mid]) {
            low = mid + 1;
            return search(key, low, high, array);
        } else {
            return mid;
        }
    }


}
