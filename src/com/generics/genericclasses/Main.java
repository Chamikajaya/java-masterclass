package com.generics.genericclasses;

public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone("Samsung");
        Laptop laptop = new Laptop("Lenovo");

        Box<Phone> phoneBox = new Box<>();  //* type argument is Phone
        phoneBox.set(phone);
        System.out.println(phoneBox.get());


        System.out.println();

        Box<Laptop> laptopBox = new Box<>();  //* type argument is Laptop
        laptopBox.set(laptop);
        System.out.println(laptopBox.get());


    }
}
