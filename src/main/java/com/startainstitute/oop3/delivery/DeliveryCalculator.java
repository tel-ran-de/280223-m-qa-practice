package com.startainstitute.oop3.delivery;

public class DeliveryCalculator {

    public double getPrice(Package packageItem, Location from, Location to) {
        double distance = getDistance(from, to);
        if (distance < 1000) {
            return StandardDeliveryMethod.AUTO.getPrice(packageItem, 1);
        }
        if (packageItem.getWeight() < 20) {
            return StandardDeliveryMethod.AERO.getPrice(packageItem, 2);
        }
        if (packageItem.getWeight() < 50) {
            return StandardDeliveryMethod.RAILWAYS.getPrice(packageItem, 3);
        }
        if (packageItem.getWeight() > 1000) {
            return new CustomDeliveryMethod(100).getPrice(packageItem, 4);
        }
        return StandardDeliveryMethod.SEA.getPrice(packageItem, 1);
    }

    private double getDistance(Location from, Location to) {
        if (from.getCountry().equals("Germany") && from.getCountry().equals("France")) {
            return 1000.0;
        } else {
            // TODO: just an example
            return 500;
        }
    }
}
