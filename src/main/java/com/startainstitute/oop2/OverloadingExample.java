package com.startainstitute.oop2;

public class OverloadingExample {

    public static void main(String[] args) {
        // 1. Overriding is a polymorphism technique. It's used to apply common algorithms to different types.
        // 2. Resolution order: widening, boxing, var args
        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(1, 2));
    }

}

@SuppressWarnings({"UnusedReturnValue", "unused"})
class Calculator {

//    public int sum(int a, int b) {
//        System.out.println("sum(int a, int b) called");
//        return a + b;
//    }

//    public int sum(long a, long b) {
//        System.out.println("sum(long a, long b) called");
//        return (int) (a + b);
//    }

    public int sum(Integer a, Integer b) {
        System.out.println("sum(Integer a, Integer b) called");
        return a + b;
    }

    public int sum(Number a, Number b) {
        System.out.println("sum(Number a, Number b) called");
        return a.intValue() + b.intValue();
    }

    public int sum(int... args) { // var args
        System.out.println("sum(int... args) called");
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
}
