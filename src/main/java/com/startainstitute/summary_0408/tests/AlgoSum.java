package com.startainstitute.summary_0408.tests;

import java.util.stream.IntStream;

public class AlgoSum {

    public int sum(int[] values) {
        return IntStream.of(values).sum();
    }

    int doSomeAnotherWork() {
        return 10;
    }
}
