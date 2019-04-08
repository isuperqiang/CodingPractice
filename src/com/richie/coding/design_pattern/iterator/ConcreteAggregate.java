package com.richie.coding.design_pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Richie on 2018.03.25
 * 具体的集合类
 */
public class ConcreteAggregate<E> implements Aggregate<E> {
    private List<E> list = new ArrayList<>();

    @Override
    public void add(E data) {
        list.add(data);
    }

    @Override
    public void remove(E data) {
        list.remove(data);
    }

    @Override
    public Iterator<E> iterator() {
        return new InnerIterator();
    }

    /**
     * 迭代器
     */
    private class InnerIterator implements Iterator<E> {
        private int cursor;

        @Override
        public boolean hasNext() {
            return cursor < list.size();
        }

        @Override
        public E next() {
            E data = list.get(cursor);
            cursor++;
            return data;
        }
    }
}
