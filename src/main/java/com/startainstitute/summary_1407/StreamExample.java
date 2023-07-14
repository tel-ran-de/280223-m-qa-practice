package com.startainstitute.summary_1407;

import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        // Stream<T>
        // IntStream, DoubleStream,..

        // Stream<Integer>.min() -> Stream<Integer>.
//        Arrays.stream(new int[] {1,2,3})

        double result = Stream.of(2, 1, 3) // Stream<Integer>
                .mapToInt(i -> i) // IntStream
                .average()
                .getAsDouble();
//                .getAsDouble();
//                .min()
//                .getAsInt();
//                .get();

        System.out.println(result);


    }
}
