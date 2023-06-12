package com.startainstitute.oop4;

public class ReferencesExample {

    public static void main(String[] args) {
        // int, double, float, short, byte, ..
        // Integer, Double, Flat, Short, Byte


        Double[] numbs = new Double[]{1.0, 2.0, null};

        for (Double num : numbs) {
            System.out.println(num * 2); // num * 2 => exception
        }
    }

    private static double sum(double a, double b) {
        return a + b;
    }
}

class ExampleClass {

    private final int number;

    public static void print() {

    }

    public ExampleClass(int number) {
        this.number = number;
    }
}
