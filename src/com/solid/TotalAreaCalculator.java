package com.solid;

import java.util.List;
import java.util.Objects;

public class TotalAreaCalculator {

    public double getTotalArea(List<Object> shapes) {
        double totalArea = 0;
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                Circle myCircle = (Circle) shapes.get(i);
                totalArea += Math.PI * Math.pow(myCircle.getRadius(), 2);
            }
            if (shapes.get(i) instanceof Square) {
                Square mySquare = (Square) shapes.get(i);
                totalArea += Math.PI * Math.pow(mySquare.getWidth(), 2);
            }
        }
        return totalArea;
    }

}
