package com.solid;

public class Formatter {

    public static String getTotalInJSON(double totArea) {
        return STR."{total : \{totArea} }";
    }

    public static String getTotalInCSV(double totArea) {
        return STR."total , \{totArea}";
    }
}
