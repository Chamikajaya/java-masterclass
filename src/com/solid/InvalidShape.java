package com.solid;

public class InvalidShape implements IShape {


    // * This violates Liskov Substitution Principle because it does

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Invalid shape provided, cannot calculate area.");
    }
}
