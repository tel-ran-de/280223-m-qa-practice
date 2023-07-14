package com.startainstitute.summary_1407;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamResult {

    public static void main(String[] args) {
//        List<Integer> list = generate(10);
//        list.forEach(i -> System.out.println("list i = " + i));
//        System.out.println("List sum = " + list.stream().mapToInt(i -> i).sum());

//        Stream<Integer> integerStream = generateStream(10);
//        integerStream.forEach(i -> System.out.println("stream i = " + i));

        Model model = new Model(List.of("one", "two", "three"));
        try (Stream<String> stringStream = model.dataStream().onClose(() -> System.out.println("Closed"))) {
            stringStream.forEach(item -> System.out.println("model item = " + item));
            stringStream.forEach(item -> System.out.println("model item = " + item));
        }


//        System.out.println("Stream sum = " + integerStream.mapToInt(i -> i).sum());

//        ModelList modelList = new ModelList(List.of("One", "Two"));
//        modelList.getData()  // O(n), n - elements in modelList
//                .forEach(item -> System.out.println("model item = " + item));
    }

    private static List<Integer> generate(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(i);
        }
        return res;
    }

    private static Stream<Integer> generateStream(int n) {
        Stream<Integer> res = Stream
                .iterate(1, i -> i + 1)
                .limit(n);
        return res;
    }
}

class Model {

    private final List<String> data;

    public Model(List<String> data) {
        this.data = data;
    }

    public Stream<String> dataStream() {
        return data
                .stream()
                .map(elem -> "prefix_" + elem);
    }
}

class ModelList {

    private final List<String> data;

    public ModelList(List<String> data) {
        this.data = data;
    }

    public List<String> getData() { // O(len(data))
        return new ArrayList<>(data); // O(n)
//        return Collections.unmodifiableList(data); // O(1)
    }
}

