package com.startainstitute.generics;

import java.lang.reflect.Array;

public class List<T> {

    private final Object[] arr;

    private int curIndex;

    public List(int capacity) {
        this.arr = new Object[capacity];
        this.curIndex = 0;
    }

    public void add(T item) {
        this.arr[curIndex++] = item;
    }

    public T get(int index) {
        return (T) arr[index];
    }
}
