package com.startainstitute.oop3.delivery;

public class Package {

    private double weight;
    private double height;
    private double length;
    private double width;

    public Package(double weight,
                   double height,
                   double length,
                   double width) {
        this.weight = weight;
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
