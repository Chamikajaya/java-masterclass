package com.chamika;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.meow();

        Cat c2 = new Cat("Tom");
        c2.meow();

        Cat c3 = new Cat("Tom", 4);
        c3.meow();

        System.out.println();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);


    }


}


