package com.richie.coding;

import java.util.Arrays;

public class FirstTest {

    public static void main(String[] args) {
        System.out.println("Hello, Java");
        int[] a = {2, 5, 3, 7, 1, 8};
        new FirstTest().quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public void quickSort(int[] nums, int l, int r) {
        if (l < r) {
            int i = l;
            int j = r;
            int pivot = nums[i];
            while (i < j) {
                while (i < j && nums[j] > pivot) {
                    j--;
                }
                if (i < j) {
                    nums[i++] = nums[j];
                }
                while (i < j && nums[i] < pivot) {
                    i++;
                }
                if (i < j) {
                    nums[j--] = nums[i];
                }
            }
            nums[i] = pivot;
            quickSort(nums, l, i - 1);
            quickSort(nums, i + 1, r);
        }
    }
}
