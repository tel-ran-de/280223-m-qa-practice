package com.startainstitute.oop3.enums;

public interface DressInterface {

    double dimension();

}

class CustomDressSize implements DressInterface {

    private double dimension;

    public CustomDressSize(double dimension) {
        this.dimension = dimension;
    }

    @Override
    public double dimension() {
        return dimension;
    }
}

class XDressSize implements DressInterface {

    @Override
    public double dimension() {
        return 10;
    }
}

class XLDressSize implements DressInterface {

    @Override
    public double dimension() {
        return 20;
    }

}

class MDressSize implements DressInterface {

    @Override
    public double dimension() {
        return 30;
    }
}
