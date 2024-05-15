package com.solid;

import java.util.List;
import java.util.Objects;

public class TotalAreaCalculator implements ITotalAreaCalculator {

    @Override
    public double getTotalArea(List<Object> shapes) {
        double totalArea = 0;
        for (int i = 0; i < shapes.size(); i++) {

            // * What if we have multiple shapes? We will have to add multiple if conditions. This is a violation of Open/Closed Principle. We should be able to add new shapes without modifying the existing code. ==>

//            if (shapes.get(i) instanceof Circle) {
//                Circle myCircle = (Circle) shapes.get(i);
//                totalArea += Math.PI * Math.pow(myCircle.getRadius(), 2);
//            }
//            if (shapes.get(i) instanceof Square) {
//                Square mySquare = (Square) shapes.get(i);
//                totalArea += Math.PI * Math.pow(mySquare.getWidth(), 2);
//            }

            totalArea += ((IShape) shapes.get(i)).getArea();  // casting the object to IShape interface and calling the getArea method.


        }
        return totalArea;
    }

    // * Now this AreaCalc class not only calculates the area, but also it is involved in printing the output in different formats. What if we want to get the total in multiple formats such as JSON, csv ,.... ? We will be violating the Single Responsibility. So instead we can create a new class for that purpose. ==>

//
//    public String getTotalInJSON(List<Object> shapes) {
//        return STR."{total \{getTotalArea(shapes)} }";
//    }

}
