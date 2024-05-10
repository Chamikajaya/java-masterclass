package com.chamika;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
         *  The equals method in Java is used to determine if two objects are considered equal or not. In the Java programming language, the equals method is defined in the Object class, which is the root class for all classes in Java. By default, the equals method provided by the Object class compares the references (memory addresses) of the two objects. However, in many cases, we want to consider two objects as equal based on their internal state (the values of their instance variables) rather than their memory addresses.
         */


        Cat c1 = new Cat("Tom");
        Cat c2 = new Cat("Tom");

        System.out.println(c1 == c2);  // memory addresses will be compared --> false

        System.out.println(c1.equals(c2));  // internal state will be compared since we override equals method  --> true


    }


}


