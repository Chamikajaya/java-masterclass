package com.solid;

public class Square implements IShape {
    private int width;


    public Square(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getWidth(), 2);
    }
}
