package com.startainstitute.generics;

public class AlgoExample {

    public static void main(String[] args) {

        // O(4 * n) == O(n)
        System.out.println(1000);
        System.out.println(1000);
        System.out.println(1000);
        System.out.println(1000);

        int[] arr = new int[100];

        // O(n) - худший случай
        arr[0] = 5;

        boolean found = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int elemI = arr[i];
                int elemJ = arr[j];
                if (elemI == 5 && elemJ == 6) {
                    found = true;
                    break;
                }
            }
        }

//        System.out.println(found);
    }
}
