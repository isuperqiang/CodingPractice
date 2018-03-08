package com.richie.learning.algorithm;

/**
 * @author Richie on 2018.03.04
 */
public class TestCast {

    public static void main(String[] args) {
        int[] a = {1, 2, 5, 12, 23, 45, 46, 56, 67, 69, 78};
        int ret = BinarySearch.searchRecursive(45, a);
        System.out.println("ret:" + ret);

        System.out.println(1+2+3.0);
    }
}
