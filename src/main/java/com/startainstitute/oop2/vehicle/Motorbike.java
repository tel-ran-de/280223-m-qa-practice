package com.startainstitute.oop2.vehicle;

public class Motorbike implements Movable, Rentable {

    private final int maxSpeed;

    public Motorbike(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int maxSpeed() {
        return maxSpeed;
    }

    @Override
    public boolean canRent() {
        return true;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "maxSpeed=" + maxSpeed +
                "canRent=true" +
                '}';
    }
}
