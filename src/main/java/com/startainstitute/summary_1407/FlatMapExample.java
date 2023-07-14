package com.startainstitute.summary_1407;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static void main(String[] args) {
        Map<Integer, List<String>> mapping = new HashMap<>();
        mapping.put(1, List.of("One", "Two", "Three"));
        mapping.put(2, List.of("1", "2", "3"));
        mapping.put(3, List.of("Foo", "Bar"));

//        Integer aObj = null;
////        aObj = 0;
//        if (aObj == null) {
//            System.out.println("is null");
//        } else if (aObj == 0) {
//            System.out.println("is 0");
//        }

        int[] keys = new int[]{1, 2};
        List<String> joinedValues = getByKeysStr(mapping, keys);

        System.out.println(joinedValues);
    }

    public static List<String> getByKeysStr(Map<Integer, List<String>> mapping,
                                            int[] keys) {

        return Arrays.stream(keys)
                .boxed()
                .flatMap(key ->
                        // key: Integer
                        // result: Stream<String>
                        mapping.get(key).stream()
                ) // Stream<String>
                .collect(Collectors.toList());
    }

    public static List<Integer> getByKeys(Map<Integer, List<Integer>> mapping,
                                          int[] keys) {
        return Arrays.stream(keys)
                .flatMap(key ->
                        // key: int
                        // result: IntStream
                        mapping.get(key).stream().mapToInt(i -> i)
                ) // IntStream
                .boxed()
                .collect(Collectors.toList());
    }
}
