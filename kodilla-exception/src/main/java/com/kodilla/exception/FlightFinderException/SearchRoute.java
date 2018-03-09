package com.kodilla.exception.FlightFinderException;

public class SearchRoute {
    public static void main(String[] args) throws RouteNotFoundException_1, RouteNotFoundException_2 {
        try {
            Flight flight01 = new Flight("Warszawa", "Szczecin");
            FlightFinder flightFinder = new FlightFinder();
            flightFinder.findFlight(flight01);
        } catch (RouteNotFoundException_1 e) {
            System.out.println("Niestety, lotniska docelowego nie znaleźliśmy w naszej bazie danych.");
        } catch (RouteNotFoundException_2 e) {
            System.out.println("Niestety, lotniska odlotów nie znaleźliśmy w naszej bazie danych.");
        } finally {
            System.out.println();
            System.out.println("Życzymy miłego dnia i zapraszamy ponownie");
        }
    }
}
