package com.startainstitute.summary_0707.mutable;

import java.util.List;
import java.util.stream.Collectors;

public class MutableExample {

    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("First vendor", "First car name"),
                new Car("Second vendor", "Second car name"));

        List<Car> newCars = new MutableExample().process(new GoodCarProcessor(), cars);

        System.out.println(cars);
        System.out.println(newCars);
    }

    public List<Car> process(CarProcessor processor, List<Car> cars) {
        return cars.stream().map(processor::process).collect(Collectors.toList());
    }
}
