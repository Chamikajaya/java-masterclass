package com.miniprojects.aviationmanagement;

public class PrivateJet extends Aircraft {

    private String ownerName;

    public PrivateJet(String model, int capacity, String registrationNumber, String ownerName) {
        super(model, capacity, registrationNumber);
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
