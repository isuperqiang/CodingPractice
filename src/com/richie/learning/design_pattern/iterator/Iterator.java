package com.richie.learning.design_pattern.iterator;

/**
 * @author Richie on 2018.03.25
 * 迭代器接口
 */
public interface Iterator<E> {
    /**
     * 是否存在下一个元素
     *
     * @return
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     *
     * @return
     */
    E next();
}
