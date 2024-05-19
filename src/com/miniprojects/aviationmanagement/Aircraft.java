package com.miniprojects.aviationmanagement;

public abstract class Aircraft {

    private String model;
    private int capacity;
    private String registrationNumber;

    public Aircraft(String model, int capacity, String registrationNumber) {
        this.model = model;
        this.capacity = capacity;
        this.registrationNumber = registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


}
