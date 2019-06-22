package com.richie.coding.other;

import java.math.BigDecimal;

/**
 * 比较浮点数是否相等
 *
 * @author Richie on 2019.06.22
 */
public class FloatCompareTest {

    public static void main(String[] args) {
        compareByOperator();
        compareByThreshold();
        compareByBigDecimal();
    }

    // 错误
    private static void compareByOperator() {
        float f1 = 0.0f;
        for (int i = 0; i < 11; i++) {
            f1 += 0.1f;
        }

        float f2 = 0.1f * 11;

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        if (f1 == f2) {
            System.out.println("f1 and f2 are equal using operator ==");
        } else {
            System.out.println("f1 and f2 are not equal using operator ==");
        }
    }

    // 正确
    private static void compareByThreshold() {
        final float THRESHOLD = 0.000001f;
        float f1 = 0.0f;
        for (int i = 0; i < 11; i++) {
            f1 += 0.1f;
        }

        float f2 = 0.1f * 11;

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        if (Math.abs(f1 - f2) < THRESHOLD) {
            System.out.println("f1 and f2 are equal using threshold");
        } else {
            System.out.println("f1 and f2 are not equal using threshold");
        }
    }

    // 正确
    private static void compareByBigDecimal() {
        BigDecimal f1 = new BigDecimal("0.0");
        BigDecimal pointOne = new BigDecimal("0.1");
        for (int i = 0; i < 11; i++) {
            f1 = f1.add(pointOne);
        }

        BigDecimal f2 = new BigDecimal("0.1");
        BigDecimal eleven = new BigDecimal("11");
        f2 = f2.multiply(eleven);

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        if (f1.compareTo(f2) == 0) {
            System.out.println("f1 and f2 are equal using BigDecimal");
        } else {
            System.out.println("f1 and f2 are not equal using BigDecimal");
        }
    }

}
