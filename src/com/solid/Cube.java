package com.solid;


// * Cube implements both IThreeDimShape and IShape interfaces whereas Triangle, Circle, and Square only implement IShape interface following the Interface Segregation Principle.🥹
public class Cube implements IThreeDimShape, IShape {

    private int side;

    public Cube(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(getSide(), 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(getSide(), 3);
    }
}
