package com.miniprojects.aviationmanagement;

import java.util.List;
import java.util.Optional;

public class AircraftManager implements IAircraftManager {

    private List<Aircraft> aircraftList;

    public AircraftManager(List<Aircraft> aircraftList) {
        this.aircraftList = aircraftList;
    }


    @Override
    public void addAircraft(Aircraft aircraft) {
        aircraftList.add(aircraft);
        System.out.println("Aircraft added");
    }

    @Override
    public void removeAircraft(String regNumber) {
        aircraftList.removeIf(aircraft -> aircraft.getRegistrationNumber().equals(regNumber));
        System.out.println("Aircraft removed");
    }

    @Override
    public Optional<Aircraft> getAircraftByRegNum(String regNum) {
        return aircraftList.stream()
                .filter(aircraft -> aircraft.getRegistrationNumber()
                        .equals(regNum))
                .findFirst();
    }

    @Override
    public List<Aircraft> getAllAircraft() {
        return aircraftList;
    }
}
