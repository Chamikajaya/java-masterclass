package com.miniprojects.aviationmanagement;

public class CommercialPlane extends Aircraft {

    private String airlineName;

    public CommercialPlane(String model, int capacity, String registrationNumber, String airlineName) {
        super(model, capacity, registrationNumber);
        this.airlineName = airlineName;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }


}

