package com.generics.genericclasses;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Phone phone = new Phone("Samsung");
//        Laptop laptop = new Laptop("Lenovo");
//
//        Box<Phone> phoneBox = new Box<>();  //* type argument is Phone
//        phoneBox.set(phone);
//        System.out.println(phoneBox.get());
//
//
//        System.out.println();
//
//        Box<Laptop> laptopBox = new Box<>();  //* type argument is Laptop
//        laptopBox.set(laptop);
//        System.out.println(laptopBox.get());
//
//        Integer[] intArr = {1, 2, 3, 4, 5};
//        String[] strArr = {"one", "two", "three", "four", "five"};
//
//        printArr(intArr);
//        printArr(strArr);

//        List<Integer> intList = List.of(1, 2, 3, 4, 5);
//        printList(intList);
//
//        List<Double> doubleList = List.of(1.1, 2.2, 3.3, 4.4, 5.5);
//        printList(doubleList);


//        List<Object> objList = new ArrayList<>();
//        List<Number> numList = new ArrayList<>();
//        numList.add(5.67);
//        numList.add(6.78);
//        addElements(numList);
//        System.out.println(numList);
//
//        addElements(objList);
//        System.out.println(objList);


    }

    // * A simple Generic method -->
//    public static <T> void printArr(T[] arr) {  // * need to declare the type parameter before the return type
//        for (T item : arr) {
//            System.out.print(STR."\{item} -> ");
//        }
//        System.out.println();
//    }

    //    * Upper Bounded Wildcards  -->
//    In the below example, the printList method takes a list of elements that are instances of Number or any subclass of Number (such as Integer, Double, etc.).
    public static void printList(List<? extends Number> list) {
        for (Number n : list) {
            System.out.print(STR."\{n} -> ");
        }
        System.out.println();
    }

    //    * Lower Bounded Wildcards  -->

    // In this example, the addElements method takes a list of elements that are instances of Integer or any superclass of Integer (such as Number or Object). This allows the method to add Integer instances to lists of different object types, as long as those types are supertypes of Integer.
    public static void addElements(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
    }

}
