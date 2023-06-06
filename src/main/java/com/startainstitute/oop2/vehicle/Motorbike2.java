package com.startainstitute.oop2.vehicle;

public class Motorbike2 extends Vehicle {

    public Motorbike2(int maxSpeed, boolean rentable) {
        super(maxSpeed, rentable);
    }

    @Override
    public long enginePower() {
        return 123;
    }
}
