package com.startainstitute.summary_0707.mutable;

public class GoodCarProcessor implements CarProcessor {

    @Override
    public Car process(Car car) {
        return new Car(car.getVendorName(), "Another name: " + car.getName());
    }
}
