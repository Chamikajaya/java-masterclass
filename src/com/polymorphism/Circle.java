package com.polymorphism;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Shape.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return Shape.PI * 2 * radius;
    }
}
