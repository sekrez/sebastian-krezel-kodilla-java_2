package com.kodilla.exception.FlightFinderException;

public class SearchRoute {
    public static void main(String[] args) throws RouteNotFoundException {
        try {
            Flight flight01 = new Flight("Poznań", "New York");
            FlightFinder flightFinder = new FlightFinder();
            flightFinder.findFlight(flight01);
        } catch (RouteNotFoundException e) {
            System.out.println("Niestety, lotów do tego miasta jeszcze nie obsługujemy.");
        } finally {
            System.out.println("Życzymy miłego dnia i zapraszamy ponownie");
        }
    }
}
