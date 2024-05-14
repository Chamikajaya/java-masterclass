package com.abstraction;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(STR."\{getName()} says Woof");
    }
}
