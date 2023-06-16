package com.startainstitute.summary_1606;

import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {

    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(o.hashCode());
        System.out.println(o.hashCode());
//        Map<Integer, Integer> hashMap = new TreeMap<>();
//
//        int[] nums = new int[] {2, 2, 3, 4, 5, 5, 6, 8, 9};
//
//        // HashMap: O(2 * n) == 2 * O(n) == O(n)
//        // TreeMap: O(n * log(n))
//        compute(hashMap, nums);
//        System.out.println(hashMap);
    }

    private static void compute(Map<Integer, Integer> hashMap, int[] nums) {
        for (int num : nums) {
            Integer count = hashMap.get(num);
            hashMap.put(num, (count == null ? 1 : count + 1));
        }
    }
}
