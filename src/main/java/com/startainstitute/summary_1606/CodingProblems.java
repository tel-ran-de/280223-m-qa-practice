package com.startainstitute.summary_1606;

import java.util.HashMap;
import java.util.Set;

public class CodingProblems {

//    public static void main(String[] args) {
//        // 1. Проверить что числа массива находятся в неубывающем порядке.
//        // 2. Найти максимальный элемент в двумерном массиве.
//        // 3. Дан массив целых чисел. Нужно найти наибольшую разницу между любыми двумя элементами
//        // массива
//        // 4. Найти дубликаты чисел в массиве.
//        // 5. Дан массив чисел в отсортированном порядке (от меньшему к большему).
//        // Нужно вывести квадраты этих чисел в отсортированном порядке.
//    }

    public static void main(String[] args) {
        CustomHashMap<Integer, String> map = new CustomHashMap<>(4);

        map.put(1, "str1");
        map.put(2, "str2");
        map.put(3, "str3");
        map.put(4, "str4");
        map.put(5, "str5");
        map.put(6, "str6");
        map.put(7, "str7");
        map.put(8, "str8");
        map.put(9, "str9");
        for (int i = 0; i <= 9; i++) {
            System.out.println(map.get(i));
        }
    }
}
