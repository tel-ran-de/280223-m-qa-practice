package com.startainstitute.oop2;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 3, 2, 16, 24, 4, 11, 9}; //
//        int[] arr = new int[] {2, 1};
//        int[] resultArr = new int[] {2, 3, 4, 7, 9, 11, 24};
        int[] resultArr = mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(resultArr));
    }

    private static int[] mergeSort(int[] arr, int from, int to) {
        if (from >= arr.length) {
            return new int[0];
        }
        if (from == to) {
            return new int[]{arr[from]};
        }
        int mid = from + (to - from) / 2;
        int[] left = mergeSort(arr, from, mid);
        int[] right = mergeSort(arr, mid + 1, to);

        int[] res = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (k < res.length) {
            if (j == right.length || (i != left.length && left[i] <= right[j])) {
                res[k++] = left[i++];
            } else {
                res[k++] = right[j++];
            }
        }
        return res;
    }
}
