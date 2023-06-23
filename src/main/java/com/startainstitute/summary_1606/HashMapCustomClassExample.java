package com.startainstitute.summary_1606;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapCustomClassExample {

    public static void main(String[] args) {
        Map<Car, Integer> hashMap = new HashMap<>();
//        CarType sedan = CarType.SEDAN; // it's OK
//        if (sedan == CarType.SEDAN) {
//            System.out.println("YES");
//        }

        Car car12 = new Car(12.0);
        Car[] cars = new Car[]{car12, new Car(20.0), car12};

        // HashMap: O(2 * n) == 2 * O(n) == O(n)
        // TreeMap: O(n * log(n))
        for (Car car : cars) {
            Integer count = hashMap.get(car);
            hashMap.put(car, (count == null ? 1 : count + 1));
        }
        System.out.println(hashMap);
    }
}

enum CarType {
    SEDAN,
    HATCHBACK,
}

class Car {

    private double power;

    public Car(double power) {
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "power=" + power +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.getPower(), getPower()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPower());
    }
}
