package com.miniprojects.aviationmanagement;

import java.util.List;
import java.util.Optional;

public interface IAircraftManager {

    void addAircraft(Aircraft aircraft);

    void removeAircraft(String regNumber);

    Optional<Aircraft> getAircraftByRegNum(String regNum);

    List<Aircraft> getAllAircraft();
}
