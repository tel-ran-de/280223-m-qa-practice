package com.startainstitute.oop3.enums;


public enum DressSize implements DressSize3 {

    S {
        @Override
        public double dimension() {
            return 10;
        }

        @Override
        void printDimension() {
            System.out.println("I'm S");
        }
    },
    XS {
        @Override
        public double dimension() {
            return 30;
        }

        @Override
        void printDimension() {
            System.out.println("I'm XS");
        }
    };

    abstract void printDimension();
}

interface DressSize3 {

    double dimension();

}
