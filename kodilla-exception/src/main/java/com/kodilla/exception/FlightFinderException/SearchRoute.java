package com.kodilla.exception.FlightFinderException;

public class SearchRoute {
    public static void main(String[] args) {
        Flight flight01 = new Flight("Poznań","Cipek");
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlight(flight01); // If arrivalport is true return communicat, if false reutn cannot flay but if not exist return Exception;
    }
}
