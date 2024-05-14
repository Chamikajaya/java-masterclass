package com.abstraction;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void speak();  // abstract method that must be implemented by subclasses

    public void sleep() {
        System.out.println("Zzz");  // concrete method
    }


}
