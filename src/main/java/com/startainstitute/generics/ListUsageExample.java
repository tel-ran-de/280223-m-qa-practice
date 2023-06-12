package com.startainstitute.generics;

import java.util.Map;

public class ListUsageExample {

    public static void main(String[] args) {
//        List<Package<Number>> l = new List<Package<Number>>(10);
//        l.add("first");
//        l.add("second");
//        Object first = l.get(0);
//        String second = l.get(1);
//        System.out.println(first);
//        System.out.println(second);
    }

    private List<Integer> createList() {
        return new List<Integer>(100);
    }
}
