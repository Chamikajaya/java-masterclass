package com.pillars;

import java.util.Arrays;

public class Programmer extends Employee {
    private String[] programmingLanguages;

    public Programmer(String name, String address, int age, String[] programmingLanguages) {
        super(name, address, age);  // calling the super class constructor using super keyword
        this.programmingLanguages = programmingLanguages;
    }

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public void work() {
        System.out.println(STR."\{getName()} is coding");
    }
    
}
