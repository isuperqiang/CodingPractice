package com.richie.coding.sort;

/**
 * @author Richie on 2018.07.15
 */
public final class SortUtils {

    private SortUtils() {
    }

    public static void swap(int[] a, int p, int q) {
        int temp = a[p];
        a[p] = a[q];
        a[q] = temp;
    }
}
