package com.solid;

public class Formatter {


    private final ITotalAreaCalculator totalAreaCalculator;   // * Now this Formatter class depends on the ITotalAreaCalculator interface, rather than depending on the AreaCalc concrete class. This is an example of Dependency Inversion Principle.😊

    public Formatter(ITotalAreaCalculator totalAreaCalculator) {
        this.totalAreaCalculator = totalAreaCalculator;
    }

    public static String getTotalInJSON(double totArea) {

        return STR."{total : \{totArea} }";
 
    }

    public static String getTotalInCSV(double totArea) {

        return STR."total , \{totArea}";
    }
}
