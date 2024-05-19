package com.miniprojects.aviationmanagement;

import java.util.List;
import java.util.Optional;

public interface IFlightScheduler {

    void scheduleFlight(Flight flight);

    void cancelFlight(int flightNumber);

    Optional<Flight> getFlightByFlightNum(int flightNum);

    List<Flight> getAllFlights();


}
