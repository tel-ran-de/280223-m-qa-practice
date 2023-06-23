package com.startainstitute.summary_2306.tuple;

import java.util.List;

public class TupleExample {

    public static void main(String[] args) {

        Tuple<String, Integer> bestStudent = findBestStudent(List.of("Anton"), new int[]{55});
        // Tuple<String, Integer> bestStudent2 = new Tuple<>("Smith", bestStudent.getSecond());
        System.out.println(bestStudent);

        Tuple<Employee, Float> bestEmployee = findBestEmployee(List.of(new Employee("Ivan")), new float[]{(float) 85.5});
        System.out.printf("Name of best employee %s and score = %s", bestEmployee.getFirst().getName(), bestEmployee.getSecond());
    }

    private static Tuple<String, Integer> findBestStudent(List<String> studentNames, int[] scores) {
        return new Tuple<>("Anton", 55);
    }

    private static Tuple<Employee, Float> findBestEmployee(List<Employee> employees, float[] scores) {
        return new Tuple<>(new Employee("Ivan"), (float) 85.5);
    }
}
