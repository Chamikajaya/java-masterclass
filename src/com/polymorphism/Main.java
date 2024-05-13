package com.polymorphism;

public class Main {

    public static void main(String[] args) {


        Shape rectangle = new Rectangle(5, 10);  // upcasting means casting a subclass to a superclass
        Shape circle = new Circle(5);

        Shape[] shapes = {rectangle, circle};

        for (Shape shape : shapes) {
            System.out.println(STR."Area: \{shape.calculateArea()}");
            System.out.println(STR."Perimeter: \{shape.calculatePerimeter()}");
            System.out.println();
        }
    }
}
