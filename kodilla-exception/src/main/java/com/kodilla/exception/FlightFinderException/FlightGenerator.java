package com.kodilla.exception.FlightFinderException;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

class FlightGenerator {
    Random generator = new Random();

    public void generateFlights(Flight flight) {
        int repeat = generator.nextInt(7) + 1;
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd  HH:mm");
        Calendar calendar = Calendar.getInstance();
        for (int i = 0; i < repeat; i++) {
            int randomMin = generator.nextInt(10080);
            calendar.add(Calendar.MINUTE, randomMin);
            String newDate = dateFormat.format(calendar.getTime());
            System.out.println(newDate + "  ---> | Odlot z lotniska: " + flight.getDepartureAirport() + "  | Przylot do: " + flight.getArrivalAirport());
        }

    }

}
