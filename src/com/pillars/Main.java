package com.pillars;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Whiskers");
        Animal dog = new Dog("Fido");

        cat.speak();
        dog.speak();

        cat.sleep();
        dog.sleep();
    }


}
