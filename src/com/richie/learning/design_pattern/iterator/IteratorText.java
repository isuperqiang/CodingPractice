package com.richie.learning.design_pattern.iterator;

/**
 * @author Richie on 2018.03.25
 */
public class IteratorText {

    public static void main(String args[]) {
        Aggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("小刘");
        aggregate.add("小李");
        aggregate.add("小王");

        Iterator<String> iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
