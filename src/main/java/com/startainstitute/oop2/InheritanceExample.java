package com.startainstitute.oop2;

public class InheritanceExample {

    public static void main(String[] args) {
        // Inheritance. This is an OOP technique to acquire properties and methods of parent object.
        // In Java, it's only possible to have one superclass.
        // There are two ways to build type hierarchies: classes and interfaces.
        // Classes/Interfaces are the only way to create new custom types.
        // Inheritance gives a great flexibility but shouldn't be overused.

        VehicleFilter vehicleFilter = new VehicleFilter();

//        vehicleFilter.getFastVehicles()
    }

}

class VehicleFilter {

    public Vehicle[] getFastVehicles(Vehicle[] vehicles) {
        Vehicle[] result = new Vehicle[vehicles.length];
        int j = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.maxSpeed() >= 60) {
                result[j++] = vehicle;
            }
        }
        return result;
    }

    public Vehicle[] getVehiclesWithDoors(Vehicle[] vehicles) {
        return new Vehicle[0];
    }
}

interface Vehicle {

    int maxSpeed();

    boolean hasDoors();
}

class Car {
}

class Motorbike {

}

class Bicycle {

}