package com.richie.coding.data_structure.array_list;

import java.util.Iterator;

/**
 * @author richie on 2019.04.20
 */
public class MyArrayList<T> {
    private Object[] data;
    private int size;

    public MyArrayList() {
        this(4);
    }

    public MyArrayList(int capacity) {
        data = new Object[capacity];
    }

    public boolean add(T t) {
        enlargeCapacity();
        data[size++] = t;
        return true;
    }

    public boolean add(int index, T t) {
        if (!rangeCheck(index)) {
            return false;
        }
        enlargeCapacity();
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        size++;
        data[index] = t;
        return true;
    }

    private void enlargeCapacity() {
        if (size >= data.length) {
            // 扩容到原来到 2 倍，暂不考虑 Int 范围
            int newSize = size << 1;
            System.out.println("enlarge to " + newSize);
            Object[] newData = new Object[newSize];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }

    public int indexOf(T t) {
        if (t == null) {
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (t == data[i]) {
                return i;
            }
        }
        return -1;
    }

    public T get(int index) {
        if (rangeCheck(index)) {
            return (T) data[index];
        } else {
            return null;
        }
    }

    public void remove(int index) {
        if (rangeCheck(index)) {
            for (int i = index + 1; i < size; i++) {
                data[i - 1] = data[i];
            }
            data[--size] = null;
        }
    }

    public boolean remove(T t) {
        if (t == null) {
            return false;
        } else {
            int index = -1;
            for (int i = 0; i < size; i++) {
                if (t == data[i]) {
                    index = i;
                    break;
                }
            }
            if (index >= 0) {
                remove(index);
                return true;
            } else {
                return false;
            }
        }
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    public boolean contains(T t) {
        if (t == null) {
            return false;
        } else {
            for (Object datum : data) {
                if (t == datum) {
                    return true;
                }
            }
        }
        return false;
    }

    public Iterator<T> iterator() {
        return new MyListIterator();
    }

    private boolean rangeCheck(int index) {
        return index >= 0 && index < data.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (Object datum : data) {
            sb.append(datum).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }


    private class MyListIterator implements Iterator<T> {
        private int currIndex;

        @Override
        public boolean hasNext() {
            return currIndex < size;
        }

        @Override
        public T next() {
            return (T) data[currIndex++];
        }
    }

}
