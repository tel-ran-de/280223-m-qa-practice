package com.startainstitute.summary_3006;

import java.util.HashSet;
import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;

public class BasicStreamExample {

    public static void main(String[] args) {
        // <primitive_type>[], <object type>[]
        // extends Collection
        // extends Map<?, ?>

        List<Integer> integers = List.of(1, 2, 3, 4, -5, -10);

//        System.out.println(processElements(integers));
//        System.out.println(processUsingCollectionStream(integers));
//        System.out.println(divideElements(integers, 5));
//        System.out.println(processElementsUsingFunction(integers, elem -> elem * 5));

        MyStringBuilder myStringBuilder = new MyStringBuilder("Anton")
                .append(" your") // MyStringBuilder
                .append(" teacher"); // MyStringBuilder
        String teacherRes = myStringBuilder // MyStringBuilder
                .toString(); // String

        System.out.println(teacherRes);
        System.out.println(myStringBuilder.getTotalParts());

        // Взять только положительные элементы и умножить их на 5
    }

    private static List<Integer> processElementsUsingFunction(List<Integer> integers, Function<Integer, Integer> func) {
        return integers.stream()
                .map(func)
                .collect(toList());
    }

    private static List<Double> divideElements(List<Integer> integers, int n) {
        return integers.stream()
                .map(elem -> {
                    double divided = ((double) elem) / n;
                    return Math.abs(divided);
                })
                .collect(toList());
    }

    private static List<Integer> processElements(List<Integer> integers) {
        // пример где мы конвертируем Stream<Integer> в IntStream и обратно
//        return integers.stream()
//                .mapToInt(elem -> elem)
//                .filter(elem -> elem >= 0) // stream
//                .map(elem -> elem * 5) // stream
//                .mapToObj(elem -> elem)
//                .collect(toList()); // any (collection, string, int)
        return integers.stream()
                .filter(elem -> elem >= 0) // stream
                .map(elem -> elem * 5) // stream
                .collect(toList()); // any (collection, string, int)
    }

    // TODO: как сделать так, чтобы filter выглядел так же как и в Stream Java.
    private static List<Integer> processUsingCollectionStream(List<Integer> integers) {
        return new CollectionStream<>(new HashSet<>(integers))
                .filter(elem -> elem >= 0 ? elem : null) // CollectionStream<Integer>
                .map(elem -> elem * 5) // CollectionStream<Integer>
                .toList(); // List<Integer>
    }
}
