package com.kodilla.exception.FlightFinderException;

import java.util.HashMap;
import java.util.Map;

final class ArrivalPortsList {

    public static HashMap<String, Boolean> getMap() {
        Map<String, Boolean> flightConnections = new HashMap<>();
        flightConnections.put("Warszawa", true);
        flightConnections.put("Kraków", true);
        flightConnections.put("Gdańsk", true);
        flightConnections.put("Katowice", true);
        flightConnections.put("Wrocław", true);
        flightConnections.put("Poznań", true);
        flightConnections.put("Rzeszów", true);
        flightConnections.put("Szczecin", true);
        flightConnections.put("London", false);
        flightConnections.put("Paris", false);
        flightConnections.put("Berlin", false);
        return new HashMap<String, Boolean>(flightConnections);
    }

}
