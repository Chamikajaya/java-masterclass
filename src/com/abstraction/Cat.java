package com.abstraction;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(STR."\{getName()} says meow");
    }
}
