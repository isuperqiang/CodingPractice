package com.richie.coding.data_structure.array_list;

/**
 * @author richie on 2019.04.20
 */
public class ArrayListTest {

    public static void main(String[] args) {
        testMyArrayList();
    }

    private static void testMyArrayList() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        for (int i = 1; i <= 10; i++) {
            myArrayList.add("i " + i);
        }
        System.out.println("list " + myArrayList + ", size " + myArrayList.size());
    }
}
