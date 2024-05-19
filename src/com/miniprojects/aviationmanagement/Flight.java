package com.miniprojects.aviationmanagement;

import java.util.List;

public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private double departureTime;
    private double arrivalTime;
    private Aircraft aircraftAssigned;

    private List<Passenger> flightPassengers;

    public Flight(int flightNumber, String origin, String destination, double departureTime, double arrivalTime, Aircraft aircraftAssigned, List<Passenger> flightPassengers) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.aircraftAssigned = aircraftAssigned;
        this.flightPassengers = flightPassengers;
    }

    public List<Passenger> getFlightPassengers() {
        return flightPassengers;
    }

    public void setFlightPassengers(List<Passenger> flightPassengers) {
        this.flightPassengers = flightPassengers;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(double arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Aircraft getAircraftAssigned() {
        return aircraftAssigned;
    }

    public void setAircraftAssigned(Aircraft aircraftAssigned) {
        this.aircraftAssigned = aircraftAssigned;
    }


    @Override
    public String toString() {
        return STR."Flight{flightNumber=\{flightNumber}, origin='\{origin}\{'\''}, destination='\{destination}\{'\''}, departureTime=\{departureTime}, arrivalTime=\{arrivalTime}, aircraftAssigned=\{aircraftAssigned}\{'}'}";
    }
}
