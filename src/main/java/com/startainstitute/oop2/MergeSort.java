package com.startainstitute.oop2;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 3, 2, 16, 24, 4, 11, 9}; //
//        int[] resultArr = new int[] {2, 3, 4, 7, 9, 11, 24};
        int[] resultArr = mergeSort(arr);
        System.out.println(Arrays.toString(resultArr));
    }

    private static int[] mergeSort(int[] arr) {
        return arr;
    }
}
