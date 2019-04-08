package com.richie.coding.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Richie on 2018.04.29
 */
public class Test {

    public static void main(String[] args) {

        //testSet();
        testList();
    }

    private static void testList() {
        //List<String> strings = new ArrayList<>();
        //strings.add("1a");
        //strings.add("2b");
        //strings.add("3c");
        // 当作 stack 使用
        LinkedList<String> strings = new LinkedList<>();
        strings.push("1a");
        strings.push("2b");
        strings.push("3c");
        int size = strings.size();
        for (int i = 0; i < size; i++) {
            String pop = strings.pop();
            System.out.println(pop);
        }
    }

    private static void testSet() {
        // 无序
        //Set<String> stringSet = new HashSet<>();
        // 有序，插入顺序
        //Set<String> stringSet = new LinkedHashSet<>();
        // 排序
        Set<String> stringSet = new TreeSet<>();
        for (int i = 0; i < 3; i++) {
            stringSet.add("I am richie " + i);
        }

        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
