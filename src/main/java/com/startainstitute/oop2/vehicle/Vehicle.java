package com.startainstitute.oop2.vehicle;

public abstract class Vehicle implements Movable, Rentable {

    private int maxSpeed;
    private boolean rentable;

    public Vehicle(int maxSpeed, boolean rentable) {
        this.maxSpeed = maxSpeed;
        this.rentable = rentable;
    }

    @Override
    public int maxSpeed() {
        return maxSpeed;
    }

    abstract public long enginePower();

    @Override
    public boolean canRent() {
        return rentable;
    }
}
