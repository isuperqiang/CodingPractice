package com.richie.coding.design_pattern.iterator;

/**
 * @author Richie on 2018.03.25
 * 集合接口
 */
public interface Aggregate<E> {
    /**
     * 添加元素
     *
     * @param data
     */
    void add(E data);

    /**
     * 移除元素
     *
     * @param data
     */
    void remove(E data);

    /**
     * 迭代器
     *
     * @return
     */
    Iterator<E> iterator();
}
