package com.solid;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        TotalAreaCalculator totalAreaCalculator = new TotalAreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);

        List<Object> myShapes = List.of(circle, square);

        System.out.println(totalAreaCalculator.getTotalArea(myShapes));

    }


}
