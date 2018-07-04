package com.richie.learning;

public class FirstTest {

    public static void main(String[] args) {
        //System.out.println("Hello, Java");

        String[] strings = {"a", "amd", "abc"};
        String s = longCom(strings);
        System.out.println("result:" + s);
    }

    //编写一个函数来查找字符串数组中最长的公共前缀字符串。

    private static String longCom(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        StringBuilder ret = new StringBuilder();
        int length = strs.length;
        int charIndex = 0;
        out:
        while (true) {
            if (strs[0] == null || charIndex >= strs[0].length()) {
                break;
            }
            char cur = strs[0].charAt(charIndex);
            for (int i = 0; i < length; i++) {
                String str = strs[i];
                if (str != null && charIndex < str.length()) {
                    if (cur != str.charAt(charIndex)) {
                        break out;
                    } else {
                        if (i == length - 1) {
                            ret.append(cur);
                        }
                    }
                } else {
                    break out;
                }
            }
            charIndex++;
        }
        return ret.toString();
    }
}
