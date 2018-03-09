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
        } else {
            if (airPorts.containsKey(departurePort)) {
                if (airPorts.get(departurePort) == Boolean.TRUE) {

                if (airPorts.containsKey(arrivalPort)) {
                    if (airPorts.get(arrivalPort) == Boolean.FALSE) {
                        System.out.println("Obecnie obsługujemy " + airPorts.size() + " lotów docelowych.");
                        System.out.println("Ale tam jeszcze nie latamy !!!");
                    } else {
                        flightGenerator.generateFlights(flight);
                        System.out.println();
                        System.out.println("Czy dokonać rezerwacji lotu z: " + departurePort + " do miasta " + arrivalPort + "?");
                    }
                } else {
                    throw new RouteNotFoundException_1("Ale tam jeszcze nie latamy");
                } } else {
                    System.out.println("Przepraszamy ale lotów z tego portu lotniczego jeszcze nie obsługujemy");} } else
                {
                throw new RouteNotFoundException_2("Error. Nie znaleziono nazwy takiego lotniska");
            }
        }
    }
}
