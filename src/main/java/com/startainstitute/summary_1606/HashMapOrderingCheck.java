package com.startainstitute.summary_1606;

import java.util.HashMap;
import java.util.Map;

public class HashMapOrderingCheck {

    public static void main(String[] args) {
        Map<Integer, Integer> hashMap = new HashMap<>(4);
        // this works
//        hashMap.put(1, 1);
//        hashMap.put(2, 2);
//        hashMap.put(3, 3);
//        hashMap.put(4, 4);
//        hashMap.put(5, 5);
        // this doesn't
        for (int i = -10; i < 10; i++) {
            hashMap.put(i, i);
        }

        hashMap.forEach((k, v) -> {
            System.out.printf("Key = %s, value = %s%n", k, v);
        });
    }
}
