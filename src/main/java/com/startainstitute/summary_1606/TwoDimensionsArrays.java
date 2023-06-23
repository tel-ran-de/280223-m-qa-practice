package com.startainstitute.summary_1606;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoDimensionsArrays {

    public static void main(String[] args) {
        int[][] nums2 = {
                {1, 2, 3}, // int[0]
                {2, 3, 4, 5}, // int[1]
                {2, 3, 5}, // int[2]
        };
        int[][][] nums3 = {
                {{1, 2, 3}, {3, 4, 5}},
                {{1, 2, 3}, {3, 4, 5}}
        };
        List<Integer> list = List.of(1, 2, 3);
        List<List<Integer>> list2 = List.of(
                List.of(1, 2, 3),
                List.of(2, 3, 4),
                List.of(5, 2, 3)
        );
        System.out.println(list2.get(0).get(2));
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[i].length; j++) {
                System.out.print(nums2[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
