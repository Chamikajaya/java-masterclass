package com.miniprojects.aviationmanagement;

import java.util.List;
import java.util.Optional;

public class FlightScheduler implements IFlightScheduler {

    private List<Flight> flightList;

    public FlightScheduler(List<Flight> flightList) {
        this.flightList = flightList;
    }

    @Override
    public void scheduleFlight(Flight flight) {
        flightList.add(flight);
        System.out.println("Flight added");
    }

    @Override
    public void cancelFlight(int flightNumber) {
        flightList.removeIf(flight -> flight.getFlightNumber() == flightNumber);
        System.out.println("Flight removed");
    }

    @Override
    public Optional<Flight> getFlightByFlightNum(int flightNum) {
        return flightList.stream().filter(flight -> flight.getFlightNumber() == flightNum).findFirst();
    }

    @Override
    public List<Flight> getAllFlights() {
        return flightList;
    }
}
