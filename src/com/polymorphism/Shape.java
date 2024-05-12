package com.polymorphism;

public interface Shape {

    // * constants
    public double PI = 3.14;
    public double CONVERSION_FACTOR = 0.3048;


    // * abstract methods
    double calculateArea();

    double calculatePerimeter();

    // * default method
    default double convertToMeters(double feet) {
        return feet * CONVERSION_FACTOR;
    }


}
