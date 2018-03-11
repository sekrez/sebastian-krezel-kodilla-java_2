package com.kodilla.exception.FlightFinderException;

import java.util.HashMap;

class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException_1, RouteNotFoundException_2 {
        String departurePort = flight.getDepartureAirport();
        String arrivalPort = flight.getArrivalAirport();
        HashMap airPorts = PortsList.getMap();
        FlightGenerator flightGenerator = new FlightGenerator();
        System.out.println("Wyszukiwanie połączenia lotniczego z: " + departurePort + "  do: " + arrivalPort);
        System.out.println("Proszę czekać...");
        System.out.println();
        if (departurePort.equals(arrivalPort)) {
            System.out.println("Nie możemy wyznaczyć odlotu i przylotu dla tego samekgo miasta");
        }

        if (airPorts.containsKey(departurePort)) {
            if (airPorts.containsKey(arrivalPort)) {
                if (airPorts.get(departurePort) == Boolean.TRUE && airPorts.get(arrivalPort) == Boolean.TRUE) {
                    flightGenerator.generateFlights(flight);
                    System.out.println();
                    System.out.println("Czy dokonać rezerwacji lotu z: " + departurePort + " do miasta " + arrivalPort + "?");
                } else if (airPorts.get(departurePort) == Boolean.FALSE) {
                    System.out.println("Przepraszamy ale odlotów z tego portu lotniczego jeszcze nie obsługujemy");
                }
                System.out.println("Obecnie obsługujemy " + airPorts.size() + " lotów docelowych.");
                System.out.println("Ale tam jeszcze nie latamy !!!");
            } else {
                throw new RouteNotFoundException_1("Wyjątek dla lotniska przylotów");
            }
        } else {
            throw new RouteNotFoundException_2("Wyjątek dla lotniska odlotów");
        }
    }
}
