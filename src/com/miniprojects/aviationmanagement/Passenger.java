package com.miniprojects.aviationmanagement;

public class Passenger {
    private String name;
    private int age;
    private int seatAssigned;

    public Passenger(String name, int age, int seatAssigned) {
        this.name = name;
        this.age = age;
        this.seatAssigned = seatAssigned;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSeatAssigned() {
        return seatAssigned;
    }

    public void setSeatAssigned(int seatAssigned) {
        this.seatAssigned = seatAssigned;
    }

    @Override
    public String toString() {
        return STR."Passenger{name='\{name}\{'\''}, age=\{age}, seatAssigned=\{seatAssigned}\{'}'}";
    }
}
