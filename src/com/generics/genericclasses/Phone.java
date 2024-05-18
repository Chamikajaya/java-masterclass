package com.generics.genericclasses;

public class Phone {
    private String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return STR."Phone{brand='\{brand}\{'\''}\{'}'}";
    }
}
