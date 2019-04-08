package com.richie.coding.data_structure.search;

/**
 * @author richie on 2018.11.03
 * 二分查找的变形
 */
public class BinarySearchDeform {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6, 6, 6, 7, 9};
        int i = binarySearch4(a, 8);
        System.out.println(i);
    }

    // 变体一：查找第一个值等于给定值的元素
    private static int binarySearch1(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + ((low + high) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == 0 || a[mid - 1] != value) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    // 变体二：查找最后一个值等于给定值的元素
    private static int binarySearch2(int[] a, int value) {
        int low = 0;
        int len = a.length;
        int high = len - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == len - 1 || a[mid + 1] != value) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    // 变体三：查找第一个大于等于给定值的元素
    private static int binarySearch3(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] >= value) {
                if (mid == 0 || a[mid - 1] < value) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (a[mid] < value) {
                low = mid + 1;
            }
        }
        return -1;
    }

    // 变体四：查找最后一个小于等于给定值的元素
    private static int binarySearch4(int[] a, int value) {
        int low = 0;
        int len = a.length;
        int high = len - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] <= value) {
                if (mid == len - 1 || a[mid + 1] > value) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else if (a[mid] > value) {
                high = mid + 1;
            }
        }
        return -1;
    }

}
