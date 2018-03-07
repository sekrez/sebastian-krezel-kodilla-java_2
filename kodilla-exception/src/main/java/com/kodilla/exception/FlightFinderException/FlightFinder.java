package com.kodilla.exception.FlightFinderException;

import java.util.HashMap;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        String arrivalPort = flight.getArrivalAirport();
        HashMap targetPorts = ArrivalPortsList.getMap();
        if (targetPorts.containsKey(arrivalPort)) {
            System.out.println("Obecnie obsługujemy " + targetPorts.size() + " lotów docelowych.");
            if (targetPorts.get(arrivalPort) == Boolean.FALSE) {
                System.out.println("Ale tam jeszcze nie latamy !!!");
            } else {
                System.out.println("Loty do miasta - " + arrivalPort + " - są przez nas obsługiwane");
                System.out.println("Dokonać rezerwacji do miasta " + arrivalPort +"?");
            }
        } else {
            throw new RouteNotFoundException("Ale tam jeszcze nie latamy");
        }

    }
}
