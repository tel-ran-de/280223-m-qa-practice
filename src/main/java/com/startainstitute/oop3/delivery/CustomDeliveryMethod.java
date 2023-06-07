package com.startainstitute.oop3.delivery;

public class CustomDeliveryMethod implements DeliveryMethod {

    private final int multiplier;

    public CustomDeliveryMethod(int multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public double getPrice(Package packageItem, int coefficient) {
        return packageItem.getWeight() * multiplier * coefficient;
    }
}
