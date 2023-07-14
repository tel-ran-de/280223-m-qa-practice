package com.startainstitute.summary_0707;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CloseHandler {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Vlad");
        names.add("Mik");
        names.add("Mick");
        names.add("V");

        try (Stream<String> v = names.stream()
                .onClose(() -> System.out.println("Stream closed, first"))
                .onClose(() -> System.out.println("Stream closed, second"))) {

            v.forEach(System.out::println);

        }
//                .close();
//
//        System.out.println("/////////////////////////////////////////");
//
//        names.stream()
//                .filter(name -> name.startsWith("M"))
//                .onClose(() -> closeStream(names))
//                .forEach(System.out::println);
    }

    private static void closeStream(List<String> names) {
        System.out.println("Stream closed");
        names.clear();
    }
}
