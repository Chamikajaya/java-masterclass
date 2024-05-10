package com.chamika;

import java.util.Objects;

public class Cat {

    /*
     * this keyword --> refers to the current instance of the class
     * helps resolve any ambiguities 😊
     */

    private String name;
    private int age;

    private String color;

    // * We can have multiple constructors if we want - but not duplicate constructors

    //    ! Java gives a default constructor even if we do not specify one ==>

    // *    default constructor passed by Java
    public Cat() {
    }

    // * Constructor which takes 2 args when creating objects
    public Cat(String name, int age) {
        this.name = name;  // means that the name prop of the instance refer to name attribute of Cat class
        this.age = age;
    }

    // * Constructor which takes 1 arg when creating objects
    public Cat(String name) {
        this.name = name;
    }

    //    * Extending a constructor ==> Constructor which takes 3 args
    public Cat(String name, int age, String color) {
        this(name, age);  // will look for the constructor which takes given 2 args
        this.color = color;
    }

    //   *  getters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    //    * setters

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println(STR."\{this.name} who is \{this.age} years old says meow. ");
    }

    // * overriding the toString method from Object class ==> So that we can get the string representation of an object
    @Override
    public String toString() {
        return STR."name:- \{this.name}, age:- \{this.age}";
    }


    // This can be generated using the IDE 🥹
    @Override
    public boolean equals(Object o) {
        // this --> current obj ,  o --> object which is being compared
        if (this == o) return true;  // If the two references point to the same object, they are equal

        if (o == null || getClass() != o.getClass())
            return false;  // If the other object is null or not an instance of the Cat class, they are not equal

        Cat cat = (Cat) o;  // Cast the other object to a Cat instance

        // Compare the values of the instance variables
        // for comparing primitives == is used & for comparing strings equals method is used 😊
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }
}
