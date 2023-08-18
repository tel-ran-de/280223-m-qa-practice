package com.startainstitute.summary_0707;

public class StreamLimitations {

    public static void main(String[] args) {

        int[] elements = {1, 2, 3};
        // O(n)
//        int max = Arrays.stream(elements)
//                .max()
//                .getAsInt();
        // O(n)
//        int sum = Arrays.stream(elements)
//                .sum();
//        System.out.printf("Max = %d, sum = %d", max, sum);

        // res: O(n) = 2 * O(n)

//        Accum result = Arrays.stream(elements) // IntStream
//                .boxed() // Stream<Integer>,
//                .parallel() // то же Stream<Integer>
//                .reduce(new Accum(), Accum::process, Accum::combine);
//
//        System.out.printf("Min = %d, sum = %d", result.min, result.sum);

        Integer number = 23892; // autoboxing

        final Holder numberHolder = new Holder(number);
        final Holder anotherHolder = new Holder(238923);
        numberHolder.number = 238923;
        anotherHolder.number = 1111;

        processHolder(numberHolder);
        System.out.println("Outside holder = " + numberHolder.number);
        // object_integer = new Integer(23892) -- это объект отдельно в памяти 0x23892
        // var number -> object_integer
        // number это отдельная ячейка в памяти, которая хранит адрес 0x23892

        // process(int 0x23892)
//        process(number); // создаём новый элемент стека, там создаём новую переменную number и присваем ей число 0x23892
//        System.out.println("Outside = " + number);


//
//        Holder max = new Holder(Integer.MIN_VALUE);
//        Holder sum = new Holder(0);
////        Integer max = Integer.MIN_VALUE
//
//        Arrays.stream(elements)
//                .boxed()
//                .peek(elem -> {
//                    max.number = Math.max(max.number, elem);
//                    sum.number += elem;
//                }).collect(Collectors.toList());
//
//        System.out.printf("Max = %d, sum = %d", max.number, sum.number);
    }

    public static void process(Integer num) {
        num = 2; // num -> 0x23893
        System.out.println("Inside = " + num);
    }

    public static void processHolder(Holder holder) {
        holder.number = 11111;
        System.out.println("Inside holder = " + holder.number);
    }
}

class Holder {

    int number;

    public Holder(int number) {
        this.number = number;
    }
}

class Accum {
    int min;
    int sum;

    public Accum() {
        this.min = Integer.MAX_VALUE;
        this.sum = 0;
    }

    public Accum(int min, int sum) {
        this.min = min;
        this.sum = sum;
    }

    public Accum process(int elem) {
        return new Accum(Math.min(elem, min), sum + elem);
    }

    public Accum combine(Accum other) {
        System.out.println("Thread name = " + Thread.currentThread().getName());
        return new Accum(Math.min(min, other.min), sum + other.sum);
    }
}
