package com.chamika;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    public static int personCount = 0;  // * since this is a static variable, it belongs to the class, not to the object

    // static initialization block --> invoked when class is loaded
    static {
        System.out.println("Starting the static block of Person class");
        System.out.println("End of the static block of Person class");
    }

    private String firstName;
    private String lastName;
    private Gender gender;
    private Cat[] cats;

    // instance initialization block - invoked once per instance
    {
        System.out.println("instance block of Person class");
        personCount++;
    }

    public Person(String firstName, String lastName, Gender gender, Cat[] cats) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.cats = cats;
    }


    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Cat[] getCats() {
        return cats;
    }

    public void setCats(Cat[] cats) {
        this.cats = cats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && gender == person.gender && Arrays.equals(cats, person.cats);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, lastName, gender);
        result = 31 * result + Arrays.hashCode(cats);
        return result;
    }

    @Override
    public String toString() {
        return STR."Person{firstName='\{firstName}\{'\''}, lastName='\{lastName}\{'\''}, gender=\{gender}, cats=\{Arrays.toString(cats)}\{'}'}";
    }
}
