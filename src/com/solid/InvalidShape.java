package com.solid;

public class InvalidShape implements IShape {


    // * This violates Liskov Substitution Principle because it does not provide a valid implementation of getArea() method.

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Invalid shape provided, cannot calculate area.");
    }
}
