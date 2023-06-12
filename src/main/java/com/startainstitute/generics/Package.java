package com.startainstitute.generics;

public class Package implements Movable {

    private final int weight;
    private final double height;
    private final double width;

    public Package(int weight, double height, double width) {
        this.weight = weight;
        this.height = height;
        this.width = width;
    }

    @Override
    public void move() {
        System.out.println("I was moved");
    }

    @Override
    public double weight() {
        return weight;
    }
}
