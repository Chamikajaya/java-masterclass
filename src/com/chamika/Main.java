package com.chamika;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cat c1 = new Cat("Tom");
        Cat c2 = new Cat("Jerry");

        Cat[] cats = {c1, c2};

        Person p1 = new Person("John", "Smith", Gender.MALE, cats);

        System.out.println(p1.toString());


    }


}


