package com.startainstitute.summary_0707.mutable;

public class Car {

    private final String vendorName;
    private final String name;

    public Car(String vendorName, String name) {
        this.vendorName = vendorName;
        this.name = name;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vendorName='" + vendorName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
