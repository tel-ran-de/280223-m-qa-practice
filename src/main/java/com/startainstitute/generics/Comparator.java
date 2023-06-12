package com.startainstitute.generics;

public class Comparator<T extends Comparator<T>> {

    public int compare(T a, T b) {
        return a.compare(a, b);
    }
}
