package com.startainstitute.summary_0408.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlgoSumTest {

    private final AlgoSum algoSum = new AlgoSum();

    @Test
    void shouldReturnSix() {
        int sum = algoSum.sum(new int[]{1, 2, 3});

        assertEquals(6, sum);
    }

    @Test
    void shouldReturnTen() {
        int sum = algoSum.sum(new int[]{1, 2, 7});

        assertEquals(10, sum);
    }

//    @Test
//    void testPrivateMethod() {
//        int res = algoSum.doSomeWork();
//
//        assertEquals(10, res);
//    }
}