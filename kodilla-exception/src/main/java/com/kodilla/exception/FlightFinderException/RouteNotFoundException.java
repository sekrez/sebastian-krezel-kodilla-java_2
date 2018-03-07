package com.kodilla.exception.FlightFinderException;

public class RouteNotFoundException extends Exception {
    public RouteNotFoundException(final String message) {
        super(message);
    }
}
