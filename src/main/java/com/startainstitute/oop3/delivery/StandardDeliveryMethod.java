package com.startainstitute.oop3.delivery;

public enum StandardDeliveryMethod implements DeliveryMethod {

    AUTO {
        @Override
        public double getPrice(Package packageItem, int coefficient) {
            return packageItem.getWeight() * 2 * coefficient;
        }
    },
    RAILWAYS {
        @Override
        public double getPrice(Package packageItem, int coefficient) {
            return packageItem.getWeight() * 1.2 * coefficient;
        }
    },
    AERO {
        @Override
        public double getPrice(Package packageItem, int coefficient) {
            return packageItem.getWeight() * 5.0 * coefficient;
        }
    },
    SEA {
        @Override
        public double getPrice(Package packageItem, int coefficient) {
            return packageItem.getWeight() * 0.2 * coefficient;
        }
    };
}
