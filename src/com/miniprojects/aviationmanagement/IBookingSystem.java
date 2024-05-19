package com.miniprojects.aviationmanagement;

import java.util.List;

public interface IBookingSystem {
    void bookFlight(int flightNumber, Passenger passenger);

    void cancelBooking(int flightNumber, Passenger passenger);

    List<Passenger> getPassengersOfAFlight(int flightNum);

}
